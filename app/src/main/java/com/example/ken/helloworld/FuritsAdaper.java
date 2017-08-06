package com.example.ken.helloworld;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Ken on 2017/8/6.
 */

public class FuritsAdaper<Fruit> extends ArrayAdapter<Fruit> {

    private int resourceID;
    public FuritsAdaper( Context context,  int resource,  List<Fruit> objects) {
        super(context, resource, objects);
        this.resourceID=resource;
    }

    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        Fruit1 fruit=(Fruit1)getItem(position);
        View view= LayoutInflater.from(getContext()).inflate(resourceID,null);
        ImageView imageView=(ImageView) view.findViewById(R.id.listIv);
        TextView textView =(TextView) view.findViewById(R.id.listTv);
        imageView.setImageResource(fruit.getImageID());
        textView.setText(fruit.getListText());
       // return super.getView(position, convertView, parent);
        return  view;
    }
}
