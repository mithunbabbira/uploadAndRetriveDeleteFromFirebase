package com.example.uploadandretrivefromfirebase;

import android.util.Log;

public class Upload {
    private String mName;
    private String mImageUrl;

    public Upload(){

        //empty constructor needed

    }
    public Upload( String name, String ImageUrl){
        Log.d("test","after passing  "+name.trim());
        if (name.trim().equals("")){
            name = "no name";
        }
        mName = name;
        mImageUrl = ImageUrl;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        Log.d("test","setName "+name.trim());
        this.mName = name;
    }

    public String getImageUrl() {
        return mImageUrl;
    }
    public  void setImageUrl(String imageUrl){
        mImageUrl = imageUrl;
    }
}
