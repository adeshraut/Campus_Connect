package com.example.adesh.login;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Display extends AppCompatActivity {
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        TextView tv = (TextView) this.findViewById(R.id.TextView03);
        tv.setSelected(true);  // Set focus to the textview
        TextView tv1 = (TextView) this.findViewById(R.id.TextView04);
        tv1.setSelected(true);  // Set focus to the textview


    }
    public void OnCLickM(View view){
        Intent intent=new Intent(this,Summit.class);
        this.startActivity(intent);
    }

    public void Menu(View view) {
        Intent intent = new Intent(this, EventsList.class);
        startActivity(intent);
    }
}



