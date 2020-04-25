package com.example.yanghuiwen.websocket.model;

abstract public class Callback {

     String event="";

    abstract public void onReceive(String str);

}
