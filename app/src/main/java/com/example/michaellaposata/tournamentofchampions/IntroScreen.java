package com.example.michaellaposata.tournamentofchampions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
public class IntroScreen extends AppCompatActivity {
    public String character = "";
    public int charIm;
    public static final String ROLE = "com.example.tournamentofchampions.ROLE";
    public static final String ROLE_IMAGE = "com.example.tournamentofchampions.ROLE_IM";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_screen);
    }

    public void setHunter(View view) {
        setCharacter("Hunter", R.drawable.hunter);
    }

    public void setCleric(View view) {
        setCharacter("Cleric", R.drawable.cleric);
    }

    public void setMonk(View view) {
        setCharacter("Monk", R.drawable.monk);
    }

    public void setFighter(View view) {
        setCharacter("Fighter",R.drawable.fighter);
    }

    public void setWarlock(View view) {
        setCharacter("Warlock", R.drawable.warlock);
    }

    public void setCharacter(String role, int image) {
        Button b = findViewById(R.id.lockinButton);
        b.setVisibility(View.VISIBLE);
        this.character = role;
        charIm = image;
        ImageView img = findViewById(R.id.characterDisplay);
        TextView name = findViewById(R.id.characterName);
        img.setImageResource(image);
        name.setText(role);
    }

    public void startGame(View view) {
        if(!this.character.equals("")) {
            Intent intent = new Intent(this, QueueScreen.class);
            intent.putExtra(this.ROLE, this.character);
            intent.putExtra(this.ROLE_IMAGE, this.charIm);
            startActivity(intent);
        }
    }
}