package com.example.yanghuiwen.websocket.model;

import org.json.JSONException;
import org.json.JSONObject;

public class Question {

    WSClient WSClient;
    JSONObject answer;
    int onoff;


    public Question(WSClient WSClient){
        super();
        this.WSClient = WSClient;
        answer=new JSONObject();
        onoff=0;

    }

    public void alter_parent(int parent_id, String name, String account, String password, Callback callback){

        JSONObject jsonObject=new JSONObject();
        try {
            jsonObject.put("id",parent_id);
            if(!name.equals(""))
                jsonObject.put("name",name);
            if(!account.equals(""))
                jsonObject.put("account",account);
            if(!password.equals(""))
            jsonObject.put("password",password);

            WSClient.sendToServer("alter_parent",jsonObject,callback);

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

    public void add_parent( String name, String account, String password, Callback callback){

        JSONObject jsonObject=new JSONObject();
        try {
            jsonObject.put("name",name);
            jsonObject.put("account",account);
            jsonObject.put("password",password);

            WSClient.sendToServer("add_parent",jsonObject,callback);

        } catch (JSONException e) {

            e.printStackTrace();
        }

    }

    public void alter_child(int child_id, String name, String birthday, String photo, Callback callback){

        JSONObject jsonObject=new JSONObject();
        try {
            jsonObject.put("id",child_id);
            if(!name.equals(""))
                jsonObject.put("name",name);
            if(!birthday.equals(""))
                jsonObject.put("birthday",birthday);
            if(!photo.equals(""))
                jsonObject.put("photo",photo);

            WSClient.sendToServer("alter_child",jsonObject,callback);

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

    public void delete_child(int child_id, Callback callback){

        JSONObject jsonObject=new JSONObject();
        try {
            jsonObject.put("child_id",child_id);

            WSClient.sendToServer("delete_child",jsonObject,callback);

        } catch (JSONException e) {

            e.printStackTrace();
        }

    }


    public void add_child(int parent_id, String name, String birthday, String photo, Callback callback){

        JSONObject jsonObject=new JSONObject();
        try {
            jsonObject.put("parent_id",parent_id);
            jsonObject.put("name",name);
            jsonObject.put("birthday",birthday);
            jsonObject.put("photo",photo);

            WSClient.sendToServer("add_child",jsonObject,callback);

        } catch (JSONException e) {

            e.printStackTrace();
        }

    }


    public void show_child(int parent_id, Callback callback){

        JSONObject jsonObject=new JSONObject();
        try {
            jsonObject.put("parent_id",parent_id);

            WSClient.sendToServer("show_child",jsonObject,callback);

        } catch (JSONException e) {

            e.printStackTrace();
        }

    }

    public void show_quiz_content(int quiz_record_id_id, Callback callback){

        JSONObject jsonObject=new JSONObject();
        try {
            jsonObject.put("quiz_record_id",quiz_record_id_id);
            WSClient.sendToServer("show_quiz_content",jsonObject,callback);

        } catch (JSONException e) {

            e.printStackTrace();
        }

    }

    public void show_quiz_record(int child_id, Callback callback){

        JSONObject jsonObject=new JSONObject();
        try {
            jsonObject.put("child_id",child_id);
            WSClient.sendToServer("show_quiz_record",jsonObject,callback);

        } catch (JSONException e) {

            e.printStackTrace();
        }

    }




    public void add_book(int child_id,String name,String category, Callback callback){

        JSONObject jsonObject=new JSONObject();
        try {
            jsonObject.put("child_id",child_id);
            jsonObject.put("name",name);
            jsonObject.put("category",category);
            WSClient.sendToServer("add_book",jsonObject,callback);

        } catch (JSONException e) {

            e.printStackTrace();
        }

    }

    public void show_book(int child_id, Callback callback){

        JSONObject jsonObject=new JSONObject();
        try {
            jsonObject.put("child_id",child_id);
            WSClient.sendToServer("show_book",jsonObject,callback);

        } catch (JSONException e) {

            e.printStackTrace();
        }

    }



    public void delete_book(int book_id, Callback callback){

        JSONObject jsonObject=new JSONObject();
        try {
            jsonObject.put("id",book_id);
            WSClient.sendToServer("delete_book",jsonObject,callback);

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

            WSClient.sendToServer("add_qa",jsonObject,callback);

        } catch (JSONException e) {

            e.printStackTrace();
        }

    }

    public void alter_book(int book_id,String name,String category, Callback callback){

        JSONObject jsonObject=new JSONObject();
        try {
            jsonObject.put("id",book_id);
            if(name !="")
                jsonObject.put("name",name);
            if(category!="")
                jsonObject.put("category",category);

            WSClient.sendToServer("alter_book",jsonObject,callback);

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

    public void alter_book_content(int id,int book_id,int qa_id, Callback callback){

        JSONObject jsonObject=new JSONObject();
        try {
            jsonObject.put("id",id);
            if(book_id !=0)
                jsonObject.put("book_id",book_id);
            if(qa_id!=0)
                jsonObject.put("qa_id",qa_id);

            WSClient.sendToServer("alter_book_content",jsonObject,callback);

        } catch (JSONException e) {

            e.printStackTrace();
        }

    }

    public void show_book_content(int book_id, Callback callback){

        JSONObject jsonObject=new JSONObject();
        try {

            jsonObject.put("id",book_id);
            WSClient.sendToServer("show_book_content",jsonObject,callback);

        } catch (JSONException e) {

            e.printStackTrace();
        }

    }

    public void add_book_content(int book_id,int qa_id, Callback callback){

        JSONObject jsonObject=new JSONObject();
        try {

            jsonObject.put("book_id",book_id);
            jsonObject.put("qa_id",qa_id);
            WSClient.sendToServer("add_book_content",jsonObject,callback);

        } catch (JSONException e) {

            e.printStackTrace();
        }

    }

    public void delete_book_content(int book_content_id, Callback callback){

        JSONObject jsonObject=new JSONObject();
        try {

            jsonObject.put("id",book_content_id);
            WSClient.sendToServer("delete_book_content",jsonObject,callback);

        } catch (JSONException e) {

            e.printStackTrace();
        }

    }


    public void show_past_question(int child_id, Callback callback){

        JSONObject jsonObject=new JSONObject();
        try {

            jsonObject.put("child_id",child_id);
            WSClient.sendToServer("show_past_question",jsonObject,callback);

        } catch (JSONException e) {

            e.printStackTrace();
        }

    }

    public void delete_past_question(int book_content_id, Callback callback){

        JSONObject jsonObject=new JSONObject();
        try {

            jsonObject.put("id",book_content_id);
            WSClient.sendToServer("delete_past_question",jsonObject,callback);

        } catch (JSONException e) {

            e.printStackTrace();
        }

    }




}
