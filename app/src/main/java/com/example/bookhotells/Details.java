package com.example.bookhotells;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Details extends AppCompatActivity {

    TextView ARooms;
    TextView PCost;
    ImageView BackImg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Intent i = getIntent();

        String Place = i.getStringExtra("Place");
        String Price = i.getStringExtra("Price");



        ARooms = findViewById(R.id.CountryName);
        PCost = findViewById(R.id.RoomPrice);



        ARooms.setText(Place);
        PCost.setText(Price);







        //EditText
        final TextView name = findViewById(R.id.CountryName);
        final ImageView Image = findViewById(R.id.Image);
        final TextView Description = findViewById(R.id.textView9);
        //Button
        Button bt = findViewById(R.id.button);

        //button click listener
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //get data from edit text
                String Cname = name.getText().toString();
                String img = Image.getImageMatrix().toString();
                String Descri = Description.getText().toString();

                //activity intent
                Intent intent = new Intent(Details.this, Booking.class);
                intent.putExtra("Name", Cname);
                intent.putExtra("About", img);
                intent.putExtra("Description", Descri);
                startActivity(intent);

            }
        });
    }
        public void Back(View view) {
            Intent i=new Intent(Details.this,Search.class);
            startActivity(i);
        }

        public void Booking(View view) {
            Intent i=new Intent(Details.this,Booking.class);
            startActivity(i);
        }


}
