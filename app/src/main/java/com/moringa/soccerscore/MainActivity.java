package com.moringa.soccerscore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.btnFindLeague) Button mbtnFindLeague;
    @BindView(R.id.editTxtType) EditText meditTxtType;
    @BindView(R.id.appName)  TextView mappName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mbtnFindLeague.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String league = meditTxtType.getText().toString();
                Intent intent = new Intent(MainActivity.this,Leagues.class);

                intent.putExtra("league",league);
                startActivity(intent);

            }
        });
    }
}