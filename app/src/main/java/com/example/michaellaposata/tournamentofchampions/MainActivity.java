package com.example.michaellaposata.tournamentofchampions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("go");
    }

    public void introScreen(View view) {
        Intent intent = new Intent(this, IntroScreen.class);
        System.out.println("click");
        startActivity(intent);
    }
}
