package com.example.bookhotells;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Booking extends AppCompatActivity {
    EditText user, mail;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);

        user = (EditText) findViewById(R.id.user);
        mail = (EditText) findViewById(R.id.mail);
        btn = (Button) findViewById(R.id.book);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String user1= user.getText().toString();
                String pass = mail.getText().toString();

                if (user1.equals("") || pass.equals(""))
                    Toast.makeText(Booking.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
                else {
                    Toast.makeText(Booking.this, "Booking is succesfull", Toast.LENGTH_SHORT).show();
                    Intent intent  = new Intent(getApplicationContext(), Thanks.class);
                    startActivity(intent);
                }
            }
    });


        Intent intent = getIntent();
        String Cname = intent.getStringExtra("Name");

        String Descri = intent.getStringExtra("Description");

        //TextView
        TextView mResultTv = findViewById(R.id.resultTv);

        //setText
        mResultTv.setText("Name: "+Cname+"\nDescription: "+Descri);

    }
}