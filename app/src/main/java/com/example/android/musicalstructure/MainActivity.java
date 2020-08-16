package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the payment category
        TextView payment = (TextView) findViewById(R.id.payment);

        // Set a click listener on that View
        payment.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the payment category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PaymentActivity}
                Intent paymentIntent = new Intent(MainActivity.this, PaymentActivity.class);

                // Start the new activity
                startActivity(paymentIntent);
            }
        });

        // Find the View that shows the now playing category
        TextView Nowplaying = (TextView) findViewById(R.id.nowplaying);

        // Set a click listener on that View
        Nowplaying.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the payment category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NowplayingActivity}
                Intent NowplayingIntent = new Intent(MainActivity.this, NowplayingActivity.class);

                // Start the new activity
                startActivity(NowplayingIntent);
            }
        });

        // Find the View that shows the albums category
        TextView albums = (TextView) findViewById(R.id.albums);

        // Set a click listener on that View
        albums.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the albums category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link AlbumsActivity}
                Intent albumsIntent = new Intent(MainActivity.this, AlbumsActivity.class);

                // Start the new activity
                startActivity(albumsIntent);
            }
        });

        // Find the View that shows the artists category
        TextView artists = (TextView) findViewById(R.id.artists);

        // Set a click listener on that View
        artists.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the artists category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ArtistsActivity}
                Intent artistsIntent = new Intent(MainActivity.this, ArtistsActivity.class);

                // Start the new activity
                startActivity(artistsIntent);
            }
        });

        // Find the View that shows the playlists category
        TextView playlists = (TextView) findViewById(R.id.playlists);

        // Set a click listener on that View
        playlists.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the playlists category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PlaylistsActivity}
                Intent playlistsIntent = new Intent(MainActivity.this, PlaylistsActivity.class);

                // Start the new activity
                startActivity(playlistsIntent);
            }
        });

        // Find the View that shows the podcasts category
        TextView podcasts = (TextView) findViewById(R.id.podcasts);

        // Set a click listener on that View
        podcasts.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the podcasts category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PodcastsActivity}
                Intent podcastsIntent = new Intent(MainActivity.this, PodcastsActivity.class);

                // Start the new activity
                startActivity(podcastsIntent);
            }
        });


    }
}
