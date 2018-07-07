package com.example.adesh.login;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;
import com.hitomi.cmlibrary.OnMenuStatusChangeListener;

import static java.lang.Thread.sleep;

public class EventsList extends AppCompatActivity {
    CircleMenu circleMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_list);
        circleMenu = (CircleMenu) findViewById(R.id.circle_menu);

        circleMenu.setMainMenu(Color.parseColor("#CDCDCD"), R.mipmap.smalls, R.mipmap.smalls);
        circleMenu.addSubMenu(Color.parseColor("#F0F8FF"), R.mipmap.logo)
                .addSubMenu(Color.parseColor("#FF4B32"), R.mipmap.span)
                .addSubMenu(Color.parseColor("#8A39FF"), R.mipmap.frontpage)
                .addSubMenu(Color.parseColor("#FF6A00"), R.mipmap.index);
        circleMenu.setOnMenuSelectedListener(new OnMenuSelectedListener() {

                                                 @Override
                                                 public void onMenuSelected(int index) {
                                                     switch (index) {
                                                         case 0:
                                                             Toast.makeText(EventsList.this, "Home Button Clicked", Toast.LENGTH_SHORT).show();
                                                             Intent intent=new Intent(EventsList.this,Tesla.class);
                                                             startActivity(intent);
                                                             break;
                                                         case 1:
                                                             Toast.makeText(EventsList.this, "Search button Clicked", Toast.LENGTH_SHORT).show();
                                                             Intent intent1=new Intent(EventsList.this,Summit.class);
                                                             startActivity(intent1);
                                                             break;
                                                         case 2:
                                                             Toast.makeText(EventsList.this, "Notify button Clciked", Toast.LENGTH_SHORT).show();
                                                             Intent intent2=new Intent(EventsList.this,Aarohan.class);
                                                             startActivity(intent2);
                                                             break;
                                                         case 3:
                                                             Toast.makeText(EventsList.this, "Settings button Clcked", Toast.LENGTH_SHORT).show();
                                                             Intent intent3=new Intent(EventsList.this,Requirements.class);
                                                             startActivity(intent3);
                                                             break;

                                                     }
                                                 }
                                             }

        );
        circleMenu.setOnMenuStatusChangeListener(new OnMenuStatusChangeListener() {

                                                     @Override
                                                     public void onMenuOpened() {
                                                         Toast.makeText(EventsList.this, "Menu Opend", Toast.LENGTH_SHORT).show();
                                                     }

                                                     @Override
                                                     public void onMenuClosed() {
                                                         Toast.makeText(EventsList.this, "Menu Closed", Toast.LENGTH_SHORT).show();
                                                     }
                                                 }
        );
    }
    @Override
    public void onBackPressed() {
        if (circleMenu.isOpened())
            circleMenu.closeMenu();
        else
            finish();
    }


}
