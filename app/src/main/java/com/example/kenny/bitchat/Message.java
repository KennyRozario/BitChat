package com.example.kenny.bitchat;

import java.util.Date;

/**
 * Created by Kenny on 2015-07-24.
 */
public class Message {

    private String mText;
    private String mSender;
    private Date mDate;

    Message(String text, String sender){
        mText = text;
        mSender = sender;
    }

    public String getSender() {
        return mSender;
    }

    public void setSender(String sender) {
        mSender = sender;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }
}
