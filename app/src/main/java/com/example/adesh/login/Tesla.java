package com.example.adesh.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Tesla extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tesla);
        final TextView registerLink=(TextView)findViewById(R.id.Tcodestorm);
        final TextView registerLink1=(TextView)findViewById(R.id.Torasql);
        final TextView registerLink2=(TextView)findViewById(R.id.Trubiccube);
        final TextView registerLink3=(TextView)findViewById(R.id.Taerobusters);
        final TextView registerLink4=(TextView)findViewById(R.id.Tcounterstrike);
        registerLink.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent registerIntent=new Intent(Tesla.this,Codestorm.class);
                Tesla.this.startActivity(registerIntent);
            }
        });
        registerLink1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent registerIntent=new Intent(Tesla.this,Ora_sql.class);
                Tesla.this.startActivity(registerIntent);
            }
        });
        registerLink2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent registerIntent=new Intent(Tesla.this,Rubic_Cube.class);
                Tesla.this.startActivity(registerIntent);
            }
        });
        registerLink3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent registerIntent=new Intent(Tesla.this,Aerobusters.class);
                Tesla.this.startActivity(registerIntent);
            }
        });
        registerLink4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent registerIntent=new Intent(Tesla.this,Counter_Strike.class);
                Tesla.this.startActivity(registerIntent);
            }
        });

    }
}
