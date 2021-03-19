package com.example.activity1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //membuat local variabel string
    String getEmail, getPassword;

    //membuat variabel editext
    EditText edMail, edPass;

    Button btLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mengambil isi edittext
        edMail = (EditText)findViewById(R.id.edemail);
        edPass = (EditText)findViewById(R.id.edpassword);

        //menyimpan isi edittext kedalam variabel string

        btLogin  = (Button) findViewById(R.id.btnLogin);

        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getEmail = edMail.getText().toString();
                getPassword = edPass.getText().toString();

                String email = "aku@mail.com";
                String pass = "2711";

                if (email.equals(email) &&  pass.equals(pass)){
                    Toast t = Toast.makeText(getApplicationContext(), "Login Sukses", Toast.LENGTH_SHORT);t.show();
                    Bundle b = new Bundle();

                    b.putString("a",email.trim());
                    b.putString("b", pass.trim());
                    Intent i = new Intent(getApplicationContext(), ActivityHasil.class);
                    i.putExtras(b);
                    startActivity(i);
                }
                else{
                    Toast t =Toast.makeText(getApplicationContext(),"Login Gagal", Toast.LENGTH_SHORT);
                    t.show();
                }


            }
        });

    }
}