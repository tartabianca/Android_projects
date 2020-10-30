package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //User: Bianca; Password: bianca
    private EditText username;
    private EditText password;
    private CardView button_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username=(EditText)findViewById(R.id.username);
        password=(EditText)findViewById(R.id.password);
        button_login=(CardView) findViewById(R.id.button_login);

        button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validare(username.getText().toString(),password.getText().toString());
            }
        });
    }

    private void validare(String n,String p){
        if(n.equals("Bianca") && p.equals("bianca")) {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        }
        else
            if(n.equals(""))
                username.setError("Lipseste username!");
            else
                if(p.equals(""))
                    password.setError("Lipseste parola!");
                else
                    if(!n.equals("Bianca"))
                         username.setError("Username invalid!");
                    else
                        password.setError("Parola invalida!");


    }
}
