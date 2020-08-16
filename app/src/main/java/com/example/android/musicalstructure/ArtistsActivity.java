package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);
        //Button to access the previous activity
        Button previous = (Button) findViewById(R.id.button_previousActivity);
        previous.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                startActivity(new Intent(ArtistsActivity.this, AlbumsActivity.class));
            }
        });
        //Button to access the next activity
        Button next = (Button) findViewById(R.id.button_nextActivity);
        next.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                startActivity(new Intent(ArtistsActivity.this, PlaylistsActivity.class));
            }
        });
    }
}
