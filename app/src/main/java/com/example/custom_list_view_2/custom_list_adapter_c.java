package com.example.custom_list_view_2;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class custom_list_adapter_c extends ArrayAdapter {

    private final Activity context;

    private final Integer[] img_id;

    private final String[] food_name;

    private final Integer[] food_price;

    private final Button btnbuy;

    public custom_list_adapter_c(@NonNull Activity context, Integer[] img_id,String[] food_name,Integer[] food_price,Button btnbuy) {
        super(context, R.layout.custom_list_adapter,food_name);
        this.context=context;
        this.img_id=img_id;
        this.food_name=food_name;
        this.food_price=food_price;
        this.btnbuy=btnbuy;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowview = inflater.inflate(R.layout.custom_list_adapter,null,true);

        ImageView tvimg_id = (ImageView) rowview.findViewById(R.id.imageView_1);
        TextView tvfood_name = (TextView) rowview.findViewById(R.id.textView_food_name);
        TextView tvfood_price = (TextView) rowview.findViewById(R.id.textView_food_price);
        Button tvbtnbuy = (Button) rowview.findViewById(R.id.button_buy);


        tvimg_id.setImageResource(img_id[position]);
        tvfood_name.setText(food_name[position]);
        tvfood_price.setText(String.valueOf(food_price[position]));

        tvbtnbuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tvbtnbuy == v)
                {
                    Intent intent = new Intent(context,food_purchase.class);
                    intent.putExtra("food_name",food_name[position]);
                    intent.putExtra("food_price",food_price[position]);
                    intent.putExtra("img_id",img_id[position]);
                    context.startActivity(intent);
                }
            }
        });

        return rowview;
    }


}
