package com.example.adesh.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Texephyr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_texephyr);
        final TextView registerLink=(TextView)findViewById(R.id.Tcoding);
        final TextView registerLink1=(TextView)findViewById(R.id.Tquiz);
        registerLink.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent registerIntent=new Intent(Texephyr.this,Coding.class);
                Texephyr.this.startActivity(registerIntent);
            }
        });
        registerLink1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent registerIntent=new Intent(Texephyr.this,Quiz.class);
                Texephyr.this.startActivity(registerIntent);
            }
        });
    }
}
