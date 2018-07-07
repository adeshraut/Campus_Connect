package com.example.adesh.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText Terp,Tusername,Tpassword,Tpassword1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
         Terp=(EditText)findViewById(R.id.ERP);
         Tusername=(EditText)findViewById(R.id.Rusername);
         Tpassword=(EditText)findViewById(R.id.Rpassword);
         Tpassword1=(EditText)findViewById(R.id.AgainPass);
        //final Button Bregister=(Button)findViewById(R.id.Register);
    }

    public void OnRegister(View view){
        String username = Tusername.getText().toString();
        String password = Tpassword.getText().toString();
        String type="register";
       /* onBackPressed();*/
        String erp=Terp.getText().toString();
        BackgroundWorker backgroundWorker2 = new BackgroundWorker(this);
        backgroundWorker2.execute(type, username, password,erp);

        /*Intent intent = new Intent (RegisterActivity.this,MainActivity.class);
        startActivity(intent);*/
        //finish();
    }
}

