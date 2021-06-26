package com.example.bookhotells;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LogIn extends AppCompatActivity {
    EditText username, password;
    Button btnlogin;
    DBHelper DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        username = (EditText) findViewById(R.id.user);
        password = (EditText) findViewById(R.id.password2);
        btnlogin = (Button) findViewById(R.id.book);
        DB = new DBHelper(this);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String user = username.getText().toString();
                String pass = password.getText().toString();

                if(user.equals("")||pass.equals(""))
                    Toast.makeText(LogIn.this, "Please enter all the fields", Toast.LENGTH_LONG).show();
                else{
                    Boolean checkuserpass = DB.checkusernamepassword(user, pass);
                    if(checkuserpass==true){
                        Toast.makeText(LogIn.this, "Sign in successfull", Toast.LENGTH_LONG).show();
                        Intent intent  = new Intent(getApplicationContext(), Search.class);
                        startActivity(intent);
                    }else{
                        Toast.makeText(LogIn.this, "Invalid Credentials", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }

    public void SignUp(View view) {
        Intent i=new Intent(getApplicationContext(),SignUp.class);
        startActivity(i);

    }
}