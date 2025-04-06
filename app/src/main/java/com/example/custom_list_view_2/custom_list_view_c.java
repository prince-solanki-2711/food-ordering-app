package com.example.custom_list_view_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class custom_list_view_c extends AppCompatActivity {

    Integer[] img_id = {R.drawable.burger,R.drawable.coffee,R.drawable.hotdog,R.drawable.pizza};

    String[] food_name = {"Burger","Coffee","Hotdog","Pizza"};

    Integer[] food_price = {100,50,200,400};

    ListView lv1;

    Button btnbuy;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_list_view);

        lv1 = findViewById(R.id.list_view_1);

        custom_list_adapter_c ob1 = new custom_list_adapter_c(this,img_id,food_name,food_price,btnbuy);
        lv1.setAdapter(ob1);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(custom_list_view_c.this, "Price of food "+food_price[position], Toast.LENGTH_SHORT).show();
            }
        });



    }
}
