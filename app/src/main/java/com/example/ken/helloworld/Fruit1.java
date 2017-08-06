package com.example.ken.helloworld;

/**
 * Created by Ken on 2017/8/6.
 */
//水果实体类
public class Fruit1 {

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getListText() {
        return listText;
    }

    public void setListText(String listText) {
        this.listText = listText;
    }

    public Fruit1(int imageID, String listText){
        this.imageID=imageID;
        this.listText=listText;
    }

    private int imageID;
    private String listText;
}
