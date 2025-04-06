package com.example.custom_list_view_2;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class success_page extends AppCompatActivity {

    ImageView imgsucess;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.success_page);

        imgsucess = findViewById(R.id.imageView_diplay_success);
    }
}
