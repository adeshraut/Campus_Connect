package com.example.adesh.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Summit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summit);
        final TextView registerLink1=(TextView)findViewById(R.id.Tcricket);
        final TextView registerLink2=(TextView)findViewById(R.id.Tfootball);
        final TextView registerLink3=(TextView)findViewById(R.id.Tbaseball);
        final TextView registerLink4=(TextView)findViewById(R.id.Tvolleyball);
        final TextView registerLink5=(TextView)findViewById(R.id.Tbadminton);
        final TextView registerLink6=(TextView)findViewById(R.id.Trowing);
        final TextView registerLink7=(TextView)findViewById(R.id.Tcarrom);
        registerLink1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent registerIntent=new Intent(Summit.this,Cricket.class);
                Summit.this.startActivity(registerIntent);
            }
        });
       registerLink2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent registerIntent=new Intent(Summit.this,Football.class);
                Summit.this.startActivity(registerIntent);
            }
        });
        registerLink3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent registerIntent=new Intent(Summit.this,Baseball.class);
                Summit.this.startActivity(registerIntent);
            }
        });
        registerLink4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent registerIntent=new Intent(Summit.this,Volleyball.class);
                Summit.this.startActivity(registerIntent);
            }
        });
        registerLink5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent registerIntent=new Intent(Summit.this,Badminton.class);
                Summit.this.startActivity(registerIntent);
            }
        });
        registerLink6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent registerIntent=new Intent(Summit.this,Rowing.class);
                Summit.this.startActivity(registerIntent);
            }
        });
        registerLink7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent registerIntent=new Intent(Summit.this,Carrom.class);
                Summit.this.startActivity(registerIntent);
            }
        });

    }
}
