package com.example.contectapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class contact_view extends AppCompatActivity {
        TextView date,following,num_following,posts,num_posts,followers,num_followers,name,welcome_text,like,share,comment;
        Button call;
        ImageView imageprofile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_view);
        date=findViewById(R.id.date);
        following=findViewById(R.id.following);
        num_following=findViewById(R.id.num_following);
        posts=findViewById(R.id.posts);
        num_posts=findViewById(R.id.num_posts);
        followers=findViewById(R.id.followers);
        num_followers=findViewById(R.id.num_followers);
        name=findViewById(R.id.name);
        welcome_text=findViewById(R.id.welcome_text);
        like=findViewById(R.id.like);
        share=findViewById(R.id.share);
        comment=findViewById(R.id.comment);
        call=findViewById(R.id.call);
        imageprofile=findViewById(R.id.imageprofile);





    }
}