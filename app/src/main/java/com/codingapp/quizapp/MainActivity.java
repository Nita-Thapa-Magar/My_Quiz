package com.codingapp.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //for implementation of button declaring variable
    private Button startBtn, bookmarksBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assigning the value of  start button
        startBtn=findViewById(R.id.start_btn);
        //setting click listener
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //setting Intent
                Intent topicIntent=new Intent(MainActivity.this,TopicsActivity.class);
                //for starting activity
                startActivity(topicIntent);
            }
        });

        bookmarksBtn=findViewById(R.id.bookmarks_btn);
        //setting click listener
        bookmarksBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //setting Intent
                Intent bookmarkIntent=new Intent(MainActivity.this,BookmarkActivity.class);
                //for starting activity
                startActivity(bookmarkIntent);
            }
        });
    }
}