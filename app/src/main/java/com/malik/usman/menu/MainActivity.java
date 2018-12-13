package com.malik.usman.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Model>menu= new ArrayList<>();
ListView listView_menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView_menu=findViewById(R.id.lstv_menu);
        listView_menu.setAdapter(new Adapter(this.menu,getApplicationContext()));



        Model item_Biryani=new Model();
        Model item_fish=new Model();
        Model item_mutton=new Model();
        Model item_chinese_rise=new Model();
        Model item_fbl=new Model();
        Model item_6=new Model();

        item_Biryani.setPic(R.drawable.biryani);
        item_Biryani.setItem_name("Biryani");
        item_Biryani.setFull_dish("Full:299 ");
        item_Biryani.setHalf_dish("Half:199");
        item_Biryani.setItem_name2("+ Raeta");

        item_fish.setPic(R.drawable.fish);
        item_fish.setItem_name("Fish");
        item_fish.setItem_name2("+ Nan");
        item_fish.setFull_dish("Per KG: 1300");

        item_chinese_rise.setPic(R.drawable.chinese_rise);
        item_chinese_rise.setItem_name("Chinese Rise");
        item_chinese_rise.setItem_name2("+ Minchorian");
        item_chinese_rise.setFull_dish("Full:999 ");
        item_chinese_rise.setHalf_dish("Half:599");

        item_mutton.setPic(R.drawable.mutton);
        item_mutton.setItem_name("Mutton");
        item_mutton.setItem_name2("+ Nan");
        item_mutton.setFull_dish("Full: 1499");
        item_mutton.setHalf_dish("Half: 899");

        item_fbl.setPic(R.drawable.fish2);
        item_fbl.setItem_name("Lahori Fish ");
        item_fbl.setItem_name2("+ Nan");
        item_fbl.setFull_dish("Full: 1499");
        item_fbl.setHalf_dish("Half: 899");

        menu.add(item_Biryani);
        menu.add(item_chinese_rise);
        menu.add(item_fish);
        menu.add(item_fbl);
        menu.add(item_mutton);





    }
}
