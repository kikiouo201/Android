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

    public void add_book(int child_id,String name,String category, Callback callback){

        JSONObject jsonObject=new JSONObject();
        try {
            jsonObject.put("child_id",child_id);
            jsonObject.put("name",name);
            jsonObject.put("category",category);
            data.sendToServer("add_book",jsonObject);

            callback.event="add_book";
            data.workqueue.add(callback);
        } catch (JSONException e) {

            e.printStackTrace();
        }

    }

    public void show_book(int child_id, Callback callback){

        JSONObject jsonObject=new JSONObject();
        try {
            jsonObject.put("child_id",child_id);
            data.sendToServer("show_book",jsonObject);

            callback.event="show_book";
            data.workqueue.add(callback);
        } catch (JSONException e) {

            e.printStackTrace();
        }

    }



    public void delete_book(int book_id, Callback callback){

        JSONObject jsonObject=new JSONObject();
        try {
            jsonObject.put("id",book_id);
            data.sendToServer("delete_book",jsonObject);

            callback.event="delete_book";
            data.workqueue.add(callback);
        } catch (JSONException e) {

            e.printStackTrace();
        }

    }

    public void add_qa(int child_id,String question_text,String answer,String question_url,String category, Callback callback){

        JSONObject jsonObject=new JSONObject();
        try {

            jsonObject.put("child_id",child_id);
            jsonObject.put("question_text",question_text);
            jsonObject.put("answer",answer);
            jsonObject.put("question_url",question_url);
            jsonObject.put("category",category);

            data.sendToServer("add_qa",jsonObject);

            callback.event="add_qa";
            data.workqueue.add(callback);
        } catch (JSONException e) {

            e.printStackTrace();
        }

    }


    public void add_book_content(int book_id,int qa_id, Callback callback){

        JSONObject jsonObject=new JSONObject();
        try {

            jsonObject.put("book_id",book_id);
            jsonObject.put("qa_id",qa_id);
            data.sendToServer("add_book_content",jsonObject);

            callback.event="add_book_content";
            data.workqueue.add(callback);
        } catch (JSONException e) {

            e.printStackTrace();
        }

    }

    public void delete_book_content(int book_content_id, Callback callback){

        JSONObject jsonObject=new JSONObject();
        try {

            jsonObject.put("id",book_content_id);
            data.sendToServer("delete_book_content",jsonObject);

            callback.event="delete_book_content";
            data.workqueue.add(callback);
        } catch (JSONException e) {

            e.printStackTrace();
        }

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

    public void delete_past_question(int book_content_id, Callback callback){

        JSONObject jsonObject=new JSONObject();
        try {

            jsonObject.put("id",book_content_id);
            data.sendToServer("delete_past_question",jsonObject);

            callback.event="delete_past_question";
            data.workqueue.add(callback);
        } catch (JSONException e) {

            e.printStackTrace();
        }

    }




}
