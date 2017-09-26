package com.rosinante24.mvvmabraham;

/**
 * Created by Rosinante24 on 9/25/17.
 */

class DummyDao {
    String text;
    String imgUrl;
    public DummyDao(String s, String urlImage) {

        imgUrl = urlImage;
        text = s;
    }

    public String getText() {
        return text;
    }
    public String getUrlImage(){
        return imgUrl;
    }
}
