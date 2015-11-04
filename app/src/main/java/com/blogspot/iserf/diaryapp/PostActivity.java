package com.blogspot.iserf.diaryapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);


        Button btnNextScreen = (Button) findViewById(R.id.btnMainMenu);

        //Listening to button event
        btnNextScreen.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {

                Intent nextScreen = new Intent(getApplicationContext(), MainActivity.class);


                // starting new activity
                startActivity(nextScreen);

            }
        });

    }
}
