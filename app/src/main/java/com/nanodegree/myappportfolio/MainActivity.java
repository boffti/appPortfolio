package com.nanodegree.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.spotifyButton);
        btn1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "This will launch my Spotify Streamer App!" , Toast.LENGTH_SHORT ).show();
            }
        });

        Button btn2 = (Button) findViewById(R.id.scoresButton);
        btn2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "This will launch my Scores App!" , Toast.LENGTH_SHORT ).show();
            }
        });

        Button btn3 = (Button) findViewById(R.id.libraryAppButton);
        btn3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "This will launch my Library App!" , Toast.LENGTH_SHORT ).show();
            }
        });

        Button btn4 = (Button) findViewById(R.id.buildItButton);
        btn4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "This will launch my Build It Bigger App!" , Toast.LENGTH_SHORT ).show();
            }
        });

        Button btn5 = (Button) findViewById(R.id.xyzButton);
        btn5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "This will launch my XYZ Reader App!" , Toast.LENGTH_SHORT ).show();
            }
        });

        Button btn6 = (Button) findViewById(R.id.capstoneButton);
        btn6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "This will launch my Capstone App!" , Toast.LENGTH_SHORT ).show();
            }
        });
    }
}
