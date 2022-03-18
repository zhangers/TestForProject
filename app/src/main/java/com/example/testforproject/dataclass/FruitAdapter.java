package com.example.testforproject.dataclass;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.testforproject.R;

import java.util.List;

public class FruitAdapter extends ArrayAdapter<Fruit> {
    private int resourceID;
    public FruitAdapter(Context context, int textViewResourceId, List<Fruit> objects){
        super(context,textViewResourceId,objects);
        resourceID=textViewResourceId;
    }

    @Override
    public View getView(int position, View convertVIew, ViewGroup parent){
        Fruit fruit=getItem(position);
        View view= LayoutInflater.from(getContext()).inflate(resourceID,parent,false);
        TextView FruitName=(TextView) view.findViewById(R.id.fruit_name);
        TextView FruitNum=(TextView) view.findViewById(R.id.fruit_num);
        FruitName.setText(fruit.getName());
        FruitNum.setText(fruit.getNum());
        return view;
    }
}
