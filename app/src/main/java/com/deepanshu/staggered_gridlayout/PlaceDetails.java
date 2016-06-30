package com.deepanshu.staggered_gridlayout;


public class PlaceDetails {
    private int imageUrl;

    private String name;

    public int getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(int imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlaceDetails(int imageUrl,String name){
        this.imageUrl = imageUrl;
        this.name = name;
    }
}
