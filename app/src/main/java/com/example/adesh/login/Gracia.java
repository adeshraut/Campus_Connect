package com.example.adesh.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Gracia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gracia);
        final TextView registerLink=(TextView)findViewById(R.id.Tdance);
        final TextView registerLink2=(TextView)findViewById(R.id.Tfashion);
        registerLink.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent registerIntent=new Intent(Gracia.this,Dance.class);
                Gracia.this.startActivity(registerIntent);
            }
        });
        registerLink2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent registerIntent=new Intent(Gracia.this,Fashion_Show.class);
                Gracia.this.startActivity(registerIntent);
            }
        });
    }
}
