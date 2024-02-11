package com.example.contectapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CallActivity extends AppCompatActivity {
    TextView callphone;
    Button callbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);
        callphone=findViewById(R.id.phonenumber);
        callbutton=findViewById(R.id.callbutton);
        Intent y=getIntent();
        String phone=y.getStringExtra("phone");
        callphone.setText("Call: "+phone);
        callbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x= new Intent(Intent.ACTION_DIAL);
                x.setData(Uri.parse("tel:"+phone));
                startActivity(x);


            }
        });
    }
}