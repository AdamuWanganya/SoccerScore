package com.moringa.soccerscore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Leagues extends AppCompatActivity {
    private TextView mleagueTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leagues);
        mleagueTextView = (TextView)findViewById(R.id.leagueTextView);
        Intent intent = getIntent();
        String league = intent.getStringExtra("league");
        mleagueTextView.setText("Here are all live leagues available: " + league);
    }
}