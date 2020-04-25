package com.example.yanghuiwen.websocket.model;

import com.example.yanghuiwen.websocket.model.Callback;
import com.example.yanghuiwen.websocket.model.Data;

import org.json.JSONException;
import org.json.JSONObject;

public class Question {

    Data data;
    JSONObject answer;
    int onoff;


    public Question(Data data){
        super();
        this.data=data;
        answer=new JSONObject();
        onoff=0;

    }






    public void show_past_question(int child_id, Callback callback){

        JSONObject jsonObject=new JSONObject();
        try {

            jsonObject.put("child_id",child_id);
            data.sendToServer("show_past_question",jsonObject);

            callback.event="show_past_question";
            data.workqueue.add(callback);
        } catch (JSONException e) {

            e.printStackTrace();
        }

    }

    public void favorite_question(int child_id,int question_id,Callback callback){

        JSONObject jsonObject=new JSONObject();
        try {

            jsonObject.put("child_id",child_id);
            jsonObject.put("question_id",question_id);
            data.sendToServer("favorite_question",jsonObject);

            callback.event="favorite_question";
            data.workqueue.add(callback);
        } catch (JSONException e) {

            e.printStackTrace();
        }
    }

    public void delete_question(int child_id,int question_id,Callback callback){
        JSONObject jsonObject=new JSONObject();
        try {

            jsonObject.put("child_id",child_id);
            jsonObject.put("question_id",question_id);
            data.sendToServer("delete_question",jsonObject);

            callback.event="delete_question";
            data.workqueue.add(callback);
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}
