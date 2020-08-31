package com.codingapp.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {
    private TextView marks,total;
    private Button quit_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        marks=findViewById(R.id.marks);
        total=findViewById(R.id.total);
        quit_btn=findViewById(R.id.quit_btn);

        marks.setText(String.valueOf(getIntent().getIntExtra("score", 0)));
        total.setText("Out of "+String.valueOf(getIntent().getIntExtra("total", 0)));

        quit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}