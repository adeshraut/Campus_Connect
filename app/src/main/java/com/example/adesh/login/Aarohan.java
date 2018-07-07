package com.example.adesh.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Aarohan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aarohan);
        final TextView registerLink=(TextView)findViewById(R.id.Tsolodance);
        final TextView registerLink1=(TextView)findViewById(R.id.Tgroupdance);
        final TextView registerLink2=(TextView)findViewById(R.id.Tsinging);
        final TextView registerLink3=(TextView)findViewById(R.id.Tstreetplay);
        registerLink.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent registerIntent=new Intent(Aarohan.this,Solodance.class);
                Aarohan.this.startActivity(registerIntent);
            }
        });
        registerLink1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent registerIntent=new Intent(Aarohan.this,Group_Dance.class);
                Aarohan.this.startActivity(registerIntent);
            }
        });
        registerLink2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent registerIntent=new Intent(Aarohan.this,Singing.class);
                Aarohan.this.startActivity(registerIntent);
            }
        });
        registerLink3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent registerIntent=new Intent(Aarohan.this,Street_Play.class);
                Aarohan.this.startActivity(registerIntent);
            }
        });

    }
}
