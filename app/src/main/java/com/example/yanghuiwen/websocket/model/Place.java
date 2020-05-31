package com.example.yanghuiwen.websocket.model;

import org.json.JSONException;
import org.json.JSONObject;

public class Place {

    WSClient WSClient;
    JSONObject answer;
    int onoff;

    public Place(WSClient WSClient){
        super();
        this.WSClient = WSClient;
        answer=new JSONObject();
        onoff=0;
    }

    public void favorite_place(int child_id, String title, String lat, String lon, Callback callback){

        JSONObject jsonObject=new JSONObject();
        try {

            jsonObject.put("child_id",child_id);
            jsonObject.put("title",title);
            jsonObject.put("lat",lat);
            jsonObject.put("lon",lon);
            WSClient.sendToServer("favorite_place",jsonObject,callback);

        } catch (JSONException e) {

            e.printStackTrace();
        }


    }

    public void falter_place(int child_id,String title,String lat,String lon,Callback callback){

        JSONObject jsonObject=new JSONObject();
        try {

            jsonObject.put("child_id",child_id);
            jsonObject.put("title",title);
            jsonObject.put("lat",lat);
            jsonObject.put("lon",lon);
            WSClient.sendToServer("falter_place",jsonObject,callback);

        } catch (JSONException e) {

            e.printStackTrace();
        }

    }

    public void show_place(int child_id,Callback callback){

        JSONObject jsonObject=new JSONObject();
        try {

            jsonObject.put("child_id",child_id);
            WSClient.sendToServer("show_place",jsonObject,callback);

        } catch (JSONException e) {

            e.printStackTrace();
        }

    }

    public void delete_place(int child_id,String place_id,Callback callback){

        JSONObject jsonObject=new JSONObject();
        try {

            jsonObject.put("child_id",child_id);
            jsonObject.put("place_id",place_id);
            WSClient.sendToServer("delete_place",jsonObject,callback);

        } catch (JSONException e) {

            e.printStackTrace();
        }

    }
}
