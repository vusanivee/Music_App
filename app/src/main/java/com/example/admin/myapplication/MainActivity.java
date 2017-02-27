package com.example.admin.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.admin.myapplication.Product.Product;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView lvProduct;
    private ProductListAdapter adapter;
    private List <Product> inProductList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvProduct = (ListView)findViewById(R.id.list_View_product);
        inProductList = new ArrayList<>();

        //Add simple data for list
        //we can get data from DB;VEBSERVICE   here
         inProductList.add(new Product(1,"Gospel","Namhla Nkosi", "Joyous Celebration"));
        inProductList.add(new Product(2,"Hip Hop","All Eyes On Me", "AKA"));
        inProductList.add(new Product(3,"RnB","Hold Up", "Beyonce"));
        inProductList.add(new Product(4,"Reggae","One Love", "Bob Marley"));
        inProductList.add(new Product(5,"Kwaito","", "Arthur Mafokate"));
        inProductList.add(new Product(6,"House","We Dance Again", "DJ Black Coffee"));
        inProductList.add(new Product(7,"Gospel","Lion Of Judah", "Lebo Sekgobela"));
        inProductList.add(new Product(10,"Reggae","Poor Man Feel It", "Peter Tosh"));
        inProductList.add(new Product(11,"rap","Dear Mama", "2 Pac"));
        inProductList.add(new Product(12,"Hip Hop","Heaven", "Dales"));

        //Init adapter
    adapter = new ProductListAdapter(this,inProductList);
        lvProduct.setAdapter(adapter);

        lvProduct.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //Do something
                //Ex display msg with product id get from view.getTag

                Toast.makeText(getBaseContext(),"Clicked product id ="+ view.getTag(), Toast.LENGTH_SHORT).show();

            }
        });

    }
}
