package com.example.yanghuiwen.websocket.model;

import com.example.yanghuiwen.websocket.model.Callback;
import com.example.yanghuiwen.websocket.model.Data;

import org.json.JSONException;
import org.json.JSONObject;

public class Translation  {

    Data data;
    JSONObject answer;
    int onoff;

    //資料儲存 jsonp

    public Translation(Data data){
        super();
        this.data=data;
        answer=new JSONObject();
        onoff=0;
    }

    public void favorite_translation(int child_id, int translation_id, String answers, Callback callback){

        JSONObject jsonObject=new JSONObject();
        try {

            jsonObject.put("child_id",child_id);
            jsonObject.put("translation_id",translation_id);
            jsonObject.put("answer",answers);
            data.sendToServer("favorite_translation",jsonObject);

            callback.event="favorite_translation";
            data.workqueue.add(callback);
        } catch (JSONException e) {
            e.printStackTrace();
        }



    }

    public void show_translation(int child_id,Callback callback){

        JSONObject jsonObject=new JSONObject();
        try {

            jsonObject.put("child_id",child_id);
            data.sendToServer("show_translation",jsonObject);

            callback.event="show_translation";
            data.workqueue.add(callback);
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
    public void delete_translation(int child_id,int translation_id,Callback callback){

        JSONObject jsonObject=new JSONObject();
        try {

            jsonObject.put("child_id",child_id);
            jsonObject.put("translation_id",translation_id);
            data.sendToServer("delete_translation",jsonObject);

            callback.event="delete_translation";
            data.workqueue.add(callback);
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

}
