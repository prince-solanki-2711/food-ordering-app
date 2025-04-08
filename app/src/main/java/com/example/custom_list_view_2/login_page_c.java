package com.example.custom_list_view_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class login_page_c extends AppCompatActivity {

    EditText eduser,edpass;
    Button btnlogin;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);

        eduser = findViewById(R.id.editTextText_username);
        edpass = findViewById(R.id.editTextText_password);
        btnlogin = findViewById(R.id.button_login);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btnlogin == v)
                {
                    String user = eduser.getText().toString();
                    String pass = edpass.getText().toString();
                    if(user.isEmpty() || pass.isEmpty())
                    {
                        Toast.makeText(login_page_c.this, "plz fill the user name and password", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        Intent intent = new Intent(login_page_c.this, custom_list_view_c.class);
                        startActivity(intent);
                        Toast.makeText(login_page_c.this, "Login Successful", Toast.LENGTH_SHORT).show();
                    }


                }
            }
        });

    }
}
