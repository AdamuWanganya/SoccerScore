package com.moringa.soccerscore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Leagues extends AppCompatActivity {
    private TextView mleagueTextView;
    private ListView mlistView1;
    private     String[] leagues = new String[] {"Liverpool vs Chelsea", "Tottenhum vs Newcastle","Egypt vs Senegal",
            "morocco vs Cameroon", "Gambia vs Bukina Faso", "Algeria vs Kenya", "Kenya vs Uganda", "Uganda vs Tanzania", "Mozambique vs Malawi" , "Liverpool vs Manu", "Mancity vs Wolvs",
            "South Africa Vs Ghana", "Australia vs Garbon","Moroco vs malawi","Somalia vs Congo", "Congo vs malawi"  };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leagues);

        mlistView1 = (ListView) findViewById(R.id.listView1);
        mleagueTextView = (TextView)findViewById(R.id.leagueTextView);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, leagues);
        mlistView1.setAdapter(adapter);

        Intent intent = getIntent();
        String league = intent.getStringExtra("league");
        mleagueTextView.setText("Here are all live leagues available: " + league);
    }
}