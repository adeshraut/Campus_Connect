package com.example.adesh.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Cultural extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cultural);
        final TextView registerLink=(TextView)findViewById(R.id.Taarohan);
        final TextView registerLink1=(TextView)findViewById(R.id.Tgracia);
        final TextView registerLink2=(TextView)findViewById(R.id.Tgoonj);
        registerLink.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent registerIntent=new Intent(Cultural.this,Aarohan.class);
                Cultural.this.startActivity(registerIntent);
            }
        });
        registerLink1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent registerIntent=new Intent(Cultural.this,Gracia.class);
                Cultural.this.startActivity(registerIntent);
            }
        });
        /*registerLink.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent registerIntent=new Intent(Cultural.this,Goonj.class);
                Cultural.this.startActivity(registerIntent);
            }
        })*/;
    }
}
