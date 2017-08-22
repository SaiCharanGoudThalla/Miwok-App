package com.example.android.miwok;

/**
 * Created by SAICHARAN on 5/30/2017.
 */
public class word {
    private static final int NO_IMAGE_APPROVED = -1;
    private int resid=NO_IMAGE_APPROVED;
    private String mtext;

    private String dtext;
    public word(String miwok,String defaulttext)
    {
        mtext=miwok;
        dtext=defaulttext;

    }

    public word(String miwok,String defaulttext,int imgid)
    {
        mtext=miwok;
        dtext=defaulttext;
        resid=imgid;
    }
     public int getImageResourceId(){
    return resid;
    }

    public String getMtext() {
        return mtext;
    }

    public String getDtext() {
        return dtext;
    }

    public boolean hasImage(){
        return resid!=NO_IMAGE_APPROVED;
    }


}