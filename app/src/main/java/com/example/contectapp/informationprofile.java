package com.example.contectapp;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class informationprofile extends AppCompatActivity {
    TextView entername,entrphone,entrdate,entrnumpost,enternumfollower;
    Button submit,addimage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informationprofile);
        entername=findViewById(R.id.enter_name);
        entrphone=findViewById(R.id.enter_phone);
        entrdate=findViewById(R.id.enter_birth);
        entrnumpost=findViewById(R.id.enter_numofpost);
        enternumfollower=findViewById(R.id.enter_numoffollower);
        submit=findViewById(R.id.submit);



        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( entername!=null && entrphone!=null && entrdate!=null && entrnumpost!=null &&  enternumfollower!=null){
                    Intent x= new Intent();
                    String name=entername.getText().toString();
                    String phone=entrphone.getText().toString();
                    String date= entrdate.getText().toString();
                    String post= entrnumpost.getText().toString();
                    String follower= enternumfollower.getText().toString();
                    contact y= new contact(name,date,phone,post,follower);
                    x.putExtra("result",y);
                    setResult(RESULT_OK,x);
                    finish();


                }
            }
        });


    }
}