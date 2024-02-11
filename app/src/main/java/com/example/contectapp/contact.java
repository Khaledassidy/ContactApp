package com.example.contectapp;

import java.io.Serializable;

public class contact implements Serializable {

   private String name,date,phone,num_followers,num_posts;

    public contact(String name, String date, String phone, String num_posts, String num_followers) {
        this.name = name;
        this.date = date;
        this.phone = phone;
        this.num_posts = num_posts;
        this.num_followers = num_followers;

    }


    public String getPhone() {
        return phone;
    }


    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getphone() {
        return phone;
    }

    public String getNum_posts() {
        return num_posts;
    }

    public String getNum_followers() {
        return num_followers;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setNum_posts(String num_posts) {
        this.num_posts = num_posts;
    }

    public void setNum_followers(String num_followers) {
        this.num_followers = num_followers;
    }
}
