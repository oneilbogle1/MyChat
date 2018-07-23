package com.example.oneilbogle.mychat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {


    private Toolbar mtoolbar;

    private FirebaseAuth mAuth;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mAuth = FirebaseAuth.getInstance();

        mtoolbar = (Toolbar) findViewById(R.id.main_app_bar);
        setSupportActionBar(mtoolbar);
        getSupportActionBar().setTitle("myChat");




    }


    @Override
    protected void onStart()

    {

        super.onStart();

        FirebaseUser currentuser = mAuth.getCurrentUser();


        if (currentuser == null)
        {

            Intent startpageIntent = new Intent(MainActivity.this, StartPageActivity.class);

            //stops the user the user to goback to the main activity
            startpageIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK| Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(startpageIntent);
            finish();

        }




    }
}
