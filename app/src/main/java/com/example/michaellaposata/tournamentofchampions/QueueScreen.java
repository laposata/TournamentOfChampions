package com.example.michaellaposata.tournamentofchampions;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.awt.font.TextAttribute;

public class QueueScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_queue_screen);
        Intent intent = getIntent();
        String role = intent.getStringExtra(IntroScreen.ROLE);
        int roleIm = intent.getIntExtra(IntroScreen.ROLE_IMAGE, 0);
        ImageView disp = findViewById(R.id.lockedRoleDisp);
        disp.setImageResource(roleIm);
        TextView text = findViewById(R.id.lockedRoleText);
        text.setText("You are the "+ role);
    }
    public void begin(View view) {
        Intent intent = new Intent(this, Board.class);
        startActivity(intent);
    }
}
