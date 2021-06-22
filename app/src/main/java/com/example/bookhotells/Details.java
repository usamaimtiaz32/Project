package com.example.bookhotells;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

    }
    public void Back(View view) {
        Intent intent=new Intent(Details.this, Search.class);
        startActivity(intent);

    }

    public void Booking(View view) {
    }
}
