package com.example.admin.myapplication;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.admin.myapplication.Product.Product;

import java.util.List;

/**
 * Created by admin on 2017/02/15.
 */
public class ProductListAdapter extends BaseAdapter {

    private Context inContext;

    private List<Product> inProductList;

    //Character

    public ProductListAdapter(Context inContext, List<Product> inProductList) {
        this.inContext = inContext;
        this.inProductList = inProductList;
    }

    @Override
    public int getCount() {
        return inProductList.size();


    }

    @Override
    public Object getItem(int position) {
        return inProductList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(inContext, R.layout.item_product_list,null);

        TextView tvName = (TextView)v.findViewById(R.id.tv_name);
        TextView tvPrice = (TextView)v.findViewById(R.id.tv_price);
        TextView tvDescriprition = (TextView)v.findViewById(R.id.tv_description);
        //Set text for TextView

        tvName.setText(inProductList.get(position).getName());
        tvPrice.setText(String.valueOf(inProductList.get(position).getPrice()) + "");
        tvDescriprition.setText(inProductList.get(position).getDescription());
        //save product id to tag
        v.setTag(inProductList.get(position).getId());


        return v;
    }



}
