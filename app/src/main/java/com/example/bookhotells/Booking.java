package com.example.bookhotells;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Booking extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
        Intent intent = getIntent();
        String Cname = intent.getStringExtra("Name");
        String img = intent.getStringExtra("About");
        String Descri = intent.getStringExtra("Description");

        //TextView
        TextView mResultTv = findViewById(R.id.resultTv);

        //setText
        mResultTv.setText("Name: "+Cname+"\nAbout: "+img+ "\nDescription: "+Descri);

    }
    }
