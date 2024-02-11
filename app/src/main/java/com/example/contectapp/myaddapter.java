package com.example.contectapp;

import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class myaddapter extends RecyclerView.Adapter<myaddapter.viewholder> {

    ArrayList<contact> arrayList;
    costumeclicklistner c;

    public myaddapter(ArrayList<contact> arrayList,costumeclicklistner c){
        this.arrayList=arrayList;
        this.c=c;
    }

    public void addcontect(contact v){
        arrayList.add(v);
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_contact_view,parent,false);
        viewholder viewholder=new viewholder(v);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        contact c=arrayList.get(position);
        holder.name.setText(c.getName());
        holder.date.setText(c.getDate());
        holder.num_posts.setText(c.getNum_posts());
        holder.num_following.setText(c.getphone());
        holder.num_followers.setText(c.getNum_followers());
        holder.name.setTag(c.getphone());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {
        TextView date,following,posts,followers,num_following,num_posts,num_followers,name,welcome_text,like,share,comment;
        ImageView imageprofile;
        Button call;


        public viewholder(@NonNull View itemView) {
            super(itemView);
            date= itemView.findViewById(R.id.date);
            following=itemView.findViewById(R.id.following);
            posts=itemView.findViewById(R.id.posts);
            followers=itemView.findViewById(R.id.followers);
            num_followers=itemView.findViewById(R.id.num_followers);
            name=itemView.findViewById(R.id.name);
            num_following=itemView.findViewById(R.id.num_following);
            num_posts=itemView.findViewById(R.id.num_posts);
            imageprofile=itemView.findViewById(R.id.imageprofile);
            call=itemView.findViewById(R.id.call);
            welcome_text=itemView.findViewById(R.id.welcome_text);
            like=itemView.findViewById(R.id.like);
            share=itemView.findViewById(R.id.share);
            comment=itemView.findViewById(R.id.comment);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //getaddapterpostion give me the id of the item i click it
                    String phone= (String) name.getTag();
                    c.onitemclick(itemView,phone);
                }
            });

        }
    }
}
