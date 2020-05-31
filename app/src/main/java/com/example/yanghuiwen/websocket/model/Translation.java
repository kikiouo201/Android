package com.example.yanghuiwen.websocket.model;

import org.json.JSONException;
import org.json.JSONObject;

public class Translation  {

    WSClient WSClient;
    JSONObject answer;
    int onoff;

    //資料儲存 jsonp

    public Translation(WSClient WSClient){
        super();
        this.WSClient = WSClient;
        answer=new JSONObject();
        onoff=0;
    }

    public void favorite_translation(int child_id, int translation_id, String answers, Callback callback){

        JSONObject jsonObject=new JSONObject();
        try {

            jsonObject.put("child_id",child_id);
            jsonObject.put("translation_id",translation_id);
            jsonObject.put("answer",answers);
            WSClient.sendToServer("favorite_translation",jsonObject,callback);


        } catch (JSONException e) {
            e.printStackTrace();
        }



    }

    public void show_translation(int child_id,Callback callback){

        JSONObject jsonObject=new JSONObject();
        try {

            jsonObject.put("child_id",child_id);
            WSClient.sendToServer("show_translation",jsonObject,callback);

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
    public void delete_translation(int child_id,int translation_id,Callback callback){

        JSONObject jsonObject=new JSONObject();
        try {

            jsonObject.put("child_id",child_id);
            jsonObject.put("translation_id",translation_id);
            WSClient.sendToServer("delete_translation",jsonObject,callback);

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

}
