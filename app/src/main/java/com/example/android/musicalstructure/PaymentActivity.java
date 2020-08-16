package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        //Button to access the previous activity
        Button previous = (Button) findViewById(R.id.button_previousActivity);
        previous.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                startActivity(new Intent(PaymentActivity.this, MainActivity.class));
            }
        });
        //Button to access the next activity
        Button next = (Button) findViewById(R.id.button_nextActivity);
        next.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                startActivity(new Intent(PaymentActivity.this, NowplayingActivity.class));
            }
        });
    }

    //https://stripe.com/docs/mobile/android
    //https://github.com/stripe/stripe-android/tree/master/example

}