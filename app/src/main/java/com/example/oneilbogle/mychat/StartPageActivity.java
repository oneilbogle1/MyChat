package com.example.oneilbogle.mychat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class StartPageActivity extends AppCompatActivity {

    private Button NeedNewAccoountButton,AlreadyHaveAccountButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);


            NeedNewAccoountButton    = (Button) findViewById(R.id.need_act_btn);
            AlreadyHaveAccountButton = (Button) findViewById(R.id.al_rdy_Btn);


            NeedNewAccoountButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent rigisterIntent = new Intent(StartPageActivity.this,RegisterActivity.class);

                    startActivity(rigisterIntent);
                }
            });





            AlreadyHaveAccountButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent LoginIntent = new Intent(StartPageActivity.this,LoginActivity.class);

                    startActivity(LoginIntent);
                }
            });
    }
}
