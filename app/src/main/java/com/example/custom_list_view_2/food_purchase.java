package com.example.custom_list_view_2;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class food_purchase extends AppCompatActivity {

    ImageView imgdis;
    TextView txtfooddis,txtfoodpricedis;
    Button btnconfirm;

    EditText txtusername,txtaddress,txtphone;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_purchase);

        imgdis = findViewById(R.id.imageView_fooddis);
        txtfooddis = findViewById(R.id.textView_food_name_dis);
        txtfoodpricedis = findViewById(R.id.textView_food_price_dis);
        btnconfirm = findViewById(R.id.button_confirm);
        txtusername = findViewById(R.id.editTextText_user_name);
        txtaddress = findViewById(R.id.editTextText_add_user);
        txtphone = findViewById(R.id.editTextPhone);


        Integer img_id = getIntent().getExtras().getInt("img_id");
        String food_name = getIntent().getExtras().getString("food_name");
        String food_price = getIntent().getExtras().getString("food_price");

        imgdis.setImageResource(img_id);
        txtfooddis.setText(food_name);
        txtfoodpricedis.setText(String.valueOf(food_price));

        btnconfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    if(txtusername.getText().toString().isEmpty() || txtaddress.getText().toString().isEmpty() || txtphone.getText().toString().isEmpty())
                    {
                        AlertDialog.Builder builder = new AlertDialog.Builder(food_purchase.this);
                        builder.setTitle("Alert");
                        builder.setMessage("Please Fill All Details");
                        builder.setPositiveButton("OK",new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                        builder.show();

                    }

                else
                {
                    Intent intent = new Intent(food_purchase.this, success_page.class);
                    startActivity(intent);
                }
            }
        });

    }
}
