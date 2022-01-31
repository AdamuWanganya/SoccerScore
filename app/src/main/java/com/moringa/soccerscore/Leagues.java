package com.moringa.soccerscore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Leagues extends AppCompatActivity {
    @BindView(R.id.listView1) ListView mlistView1;
    @BindView(R.id.leagueTextView) TextView mleagueTextView;

    private     String[] leagues = new String[] {"Liverpool vs Chelsea", "Tottenhum vs Newcastle","Egypt vs Senegal","morocco vs Cameroon",
            "Gambia vs Bukina Faso", "Algeria vs Kenya", "Kenya vs Uganda", "Uganda vs Tanzania", "Mozambique vs Malawi" , "Liverpool vs Manu",
            "Mancity vs Wolvs", "South Africa Vs Ghana", "Australia vs Garbon","Moroco vs malawi","Somalia vs Congo", "Congo vs malawi"  };

    private String[] liveScore = new String[] {"1:1", "1:0","0:0","2:0","8:3","2:3","3:0","0:3","0:0","4:2","2:0","0:0","2:1","3:1","0:0","0:0"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leagues);
        ButterKnife.bind(this);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, leagues);
        mlistView1.setAdapter(adapter);

        mlistView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String league = ((TextView)view).getText().toString();
                Toast.makeText(Leagues.this, league, Toast.LENGTH_SHORT).show();
            }
        });

        Intent intent = getIntent();
        String league = intent.getStringExtra("league");
        mleagueTextView.setText("Here are all live leagues available: " + league);
    }
}