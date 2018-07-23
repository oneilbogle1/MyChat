package com.example.oneilbogle.mychat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class LoginActivity extends AppCompatActivity {


    private Toolbar ltoolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



        ltoolbar = (Toolbar) findViewById(R.id.loginbar);
        setSupportActionBar(ltoolbar);
        getSupportActionBar().setTitle("Signin");
        //noinspection RestrictedApi
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);




    }
}
