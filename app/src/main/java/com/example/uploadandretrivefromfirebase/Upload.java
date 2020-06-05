package com.example.uploadandretrivefromfirebase;

public class Upload {
    private String mName;
    private String mImageUrl;

    public Upload(){

        //empty constructor needed

    }
    public Upload(String name, String ImageUrl){
        if (name.trim().equals("")){
            name = "no name";
        }
        mName = name;
        mImageUrl = ImageUrl;
    }

    public String geName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public String getImageUrl() {
        return mImageUrl;
    }
    public  void setImageUrl(String imageUrl){
        mImageUrl = imageUrl;
    }
}
