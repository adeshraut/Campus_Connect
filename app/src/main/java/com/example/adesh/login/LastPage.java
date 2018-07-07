package com.example.adesh.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LastPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last_page);
        final Button BExit=(Button)findViewById(R.id.BExit);

        BExit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent registerIntent=new Intent(LastPage.this,MainActivity.class);
                LastPage.this.startActivity(registerIntent);
            }
        });
    }


}
