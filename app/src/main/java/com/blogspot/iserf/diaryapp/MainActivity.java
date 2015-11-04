package com.blogspot.iserf.diaryapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnAddRecord = (Button) findViewById(R.id.btnAddRecord);

        //Listening to button event
        btnAddRecord.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {

                Intent nextScreen = new Intent(getApplicationContext(), PostActivity.class);


                // starting new activity
                startActivity(nextScreen);

            }
        });


        Button btnCalendar = (Button) findViewById(R.id.btnCalendar);

        //Listening to button event
        btnCalendar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {

                Intent nextScreen = new Intent(getApplicationContext(), CalendarActivity.class);


                // starting new activity
                startActivity(nextScreen);

            }
        });


    }
}
