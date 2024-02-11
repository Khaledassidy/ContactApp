package com.example.contectapp;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.sql.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {
 Button Add;
 RecyclerView recyclerView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Add=findViewById(R.id.add_button);
        recyclerView=findViewById(R.id.rc_view);
        ArrayList<contact> arrayList=new ArrayList<>();
        myaddapter myaddapter=new myaddapter(arrayList, new costumeclicklistner() {
            @Override
            public void onitemclick(View v, String phone) {
                Intent x= new Intent(getApplicationContext(),CallActivity.class);
                x.putExtra("phone",phone);
                startActivity(x);
            }
        });

        LinearLayoutManager b=new LinearLayoutManager(getApplicationContext());
        b.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(b);
        recyclerView.setAdapter(myaddapter);
        //Activity ResultLuncher howe badel byesta5dam la na3mel action nefta7 activity implicitintent,explicit intent efta7 lgallary permission < le ben haw l 2 bracket generek type how nou3 le bade efta7o iza sowar masaln string iza activity intent >,ba3den 3ande (ben hawde l kawsen l action eno bade efta7 activity jdede bade efta7 contents w ,l type tene l call back eno bas erja3 3al activity sho 2a3mel) w l activityresult how le 7a yeje n setResult le bel activity teneye example activityinformationprofile y3ne iza 7atet intenet bel activity b w bade jeba b olo o.getdata bjeble yaha w e5er she bade sha8ela b 7ot l.lunch(w no3 le arsalto bel jenerec type le howe 7asab data le bade efta7a
        // )
        //badel l startactivity(intent,requestcode)
        //badel activityforresult
        ActivityResultLauncher<Intent> L=registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult o) {
                        Intent x= o.getData();
                        contact y=(contact)x.getSerializableExtra("result");
                        myaddapter.addcontect(y);
                        myaddapter.notifyDataSetChanged();
                        /*or you can write layout manager in this way
                        RecyclerView.LayoutManager ln = new LinearLayoutManager or GridLayoutManager (getApplicationContext());
                        recyclerView.setLayoutManager(b);*/

                    }
                }
        );
        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x=new Intent(getApplicationContext(), informationprofile.class);
                L.launch(x);

            }



        });

    }



}