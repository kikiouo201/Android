package com.example.yanghuiwen.websocket.model;

import com.example.yanghuiwen.websocket.model.Callback;
import com.example.yanghuiwen.websocket.model.Data;

import org.json.JSONException;
import org.json.JSONObject;

public class Place {

    Data data;
    JSONObject answer;
    int onoff;

    public Place(Data data){
        super();
        this.data=data;
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
            data.sendToServer("favorite_place",jsonObject);

            callback.event="favorite_place";
            data.workqueue.add(callback);
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
            data.sendToServer("falter_place",jsonObject);

            callback.event="falter_place";
            data.workqueue.add(callback);
        } catch (JSONException e) {

            e.printStackTrace();
        }

    }

    public void show_place(int child_id,Callback callback){

        JSONObject jsonObject=new JSONObject();
        try {

            jsonObject.put("child_id",child_id);
            data.sendToServer("show_place",jsonObject);

            callback.event="show_place";
            data.workqueue.add(callback);
        } catch (JSONException e) {

            e.printStackTrace();
        }

    }

    public void delete_place(int child_id,String place_id,Callback callback){

        JSONObject jsonObject=new JSONObject();
        try {

            jsonObject.put("child_id",child_id);
            jsonObject.put("place_id",place_id);
            data.sendToServer("delete_place",jsonObject);

            callback.event="delete_place";
            data.workqueue.add(callback);
        } catch (JSONException e) {

            e.printStackTrace();
        }

    }
}
