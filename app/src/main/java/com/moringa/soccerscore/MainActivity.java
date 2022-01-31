package com.moringa.soccerscore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mbtnFindLeague;
    private EditText meditTxtType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mbtnFindLeague = (Button) findViewById(R.id.btnFindLeague);
        meditTxtType = (EditText) findViewById(R.id.editTxtType);

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