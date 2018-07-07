package com.example.adesh.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Technical extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technical);
        final TextView registerLink=(TextView)findViewById(R.id.Ttesla);
        final TextView registerLink1=(TextView)findViewById(R.id.Ttexephyr);
        registerLink.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent registerIntent=new Intent(Technical.this,Tesla.class);
                Technical.this.startActivity(registerIntent);
            }
        });
        registerLink1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent registerIntent=new Intent(Technical.this,Texephyr.class);
                Technical.this.startActivity(registerIntent);
            }
        });
    }
}
