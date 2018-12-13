package com.malik.usman.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class Adapter  extends BaseAdapter {
    Context context_asm;
    ArrayList<Model> menu= new ArrayList<>();
    LayoutInflater inflater;

    public Adapter(ArrayList<Model> menu, Context applicationContext) {
    this.context_asm=applicationContext;
    this.menu=menu;
    }


    @Override
    public int getCount() {
        return menu.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view==null){
            inflater=LayoutInflater.from(context_asm);
            view=inflater.inflate(R.layout.design,null);}
        ImageView imgv=view.findViewById(R.id.rise_id);
        TextView item_name=view.findViewById(R.id.item_name);
        TextView item_name2=view.findViewById(R.id.item_name2);
        TextView price_f=view.findViewById(R.id.price_f);
        TextView price_h=view.findViewById(R.id.price_h);

            imgv.setImageResource(menu.get(i).getPic());
            item_name.setText(menu.get(i).getItem_name());
            item_name2.setText(menu.get(i).getItem_name2());
            price_f.setText(menu.get(i).getFull_dish());
            price_h.setText(menu.get(i).getHalf_dish());
            return view;
        }
    }
