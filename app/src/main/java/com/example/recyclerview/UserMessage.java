package com.example.recyclerview;

import java.lang.reflect.Type;

public class UserMessage {
    public static final int TYPE_SEND=1;
    public static final int TYPE_RECEIVE=0;
    private String content;
    private int type;

    public UserMessage(String content,int type){
        this.content=content;
        this.type=type;
    }

    public  int getType(){
        return type;
    }
    public void setType(int type){
        this.type=type;
    }
    public String getContent(){
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
