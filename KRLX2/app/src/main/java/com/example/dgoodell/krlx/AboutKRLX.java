package com.example.dgoodell.krlx;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class AboutKRLX extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_krlx);

        TextView btnSecret = (TextView) findViewById(R.id.btnSecret);
        btnSecret.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView ivSchillerParty = (ImageView) findViewById(R.id.ivSchillerParty);
                ivSchillerParty.setVisibility(ivSchillerParty.VISIBLE);
            }
        });


    }
}
