package com.example.uploadandretrivefromfirebase;

import android.util.Log;

import com.google.firebase.database.Exclude;

public class Upload {
    private String mName;
    private String mImageUrl;
    private String mKey;

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


    @Exclude
    public String getKey(){
        return mKey;
    }
    @Exclude
    public void setKey(String key){
        mKey = key;
    }
}
