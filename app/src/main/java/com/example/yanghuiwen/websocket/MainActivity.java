package com.example.yanghuiwen.websocket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.yanghuiwen.websocket.model.Callback;
import com.example.yanghuiwen.websocket.model.Data;
import com.example.yanghuiwen.websocket.model.PiApi;
import com.example.yanghuiwen.websocket.model.Translation;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class MainActivity extends AppCompatActivity {
    Data socket;
    Translation translation;

    PiApi piApi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        piApi=new PiApi();


    }


    public void connect(View view) {
        String str="";

//        piApi.question.show_past_question(1, new Callback() {
//            @Override
//            public void onReceive(String str) {
//
//                //裡面放你要做的事
//                TextView textView=findViewById(R.id.one);
//                try{
//                JSONObject jsonObject=new JSONObject(str);
//                JSONArray jsonArray=(JSONArray) jsonObject.get("content");
//
//                String text="";
//                for(int i=0;i<jsonArray.length();i++){
//                    JSONObject QA=(JSONObject) jsonArray.get(i);
//                    text+="\nQ:"+QA.get("question_text")+"\nA:"+QA.get("answer");
//                }
//                textView.setText(text);
//                }catch (JSONException ex){
//                    ex.printStackTrace();
//                }
//            }
//        });
//        piApi.translation.favorite_translation(2, 287, "呵呵呵", new Callback() {
//            @Override
//            void onReceive(String str) {
//                TextView textView=findViewById(R.id.one);
//                textView.setText(textView.getText()+"\n"+str);
//            }
//        });
//        piApi.place.favorite_place(3, "家裡", "123.123", "456.456", new Callback() {
//            @Override
//            public void onReceive(String str) {
//                TextView textView=findViewById(R.id.one);
//                try{
//                    JSONObject jsonObject=new JSONObject(str);
//                    JSONObject jsonArray=(JSONObject) jsonObject.get("content");
//
//                    String text=jsonArray.get("name")+"\nA:"+jsonArray.get("content");
//
//
//                    textView.setText(textView.getText()+"\n"+text);
//                }catch (JSONException ex){
//                    ex.printStackTrace();
//                }
//
//
//            }
//        });
//        piApi.place.favorite_place(1, "房間", "123.123", "456.456", new Callback() {
//            @Override
//            public void onReceive(String str) {
//                TextView textView=findViewById(R.id.one);
//                try{
//                    JSONObject jsonObject=new JSONObject(str);
//                    JSONArray jsonArray=(JSONArray) jsonObject.get("content");
//
//                    String text="";
//                    for(int i=0;i<jsonArray.length();i++){
//                        JSONObject QA=(JSONObject) jsonArray.get(i);
//                        text+="\nQ:"+QA.get("question_text")+"\nA:"+QA.get("answer");
//                    }
//                    textView.setText(textView.getText()+"\n"+text);
//                }catch (JSONException ex){
//                    ex.printStackTrace();
//                }
//
//            }
//        });
//        piApi.question.add_book_content(1,20, new Callback() {
//            @Override
//            public void onReceive(String str) {
//
//            }
//        });
//        piApi.question.delete_book_content(9, new Callback() {
//            @Override
//            public void onReceive(String str) {
//                TextView textView=findViewById(R.id.one);
//                textView.setText(textView.getText()+"\n"+str);
//            }
//        });

//        piApi.question.delete_past_question(21, new Callback() {
//            @Override
//            public void onReceive(String str) {
//                TextView textView=findViewById(R.id.one);
//                textView.setText(textView.getText()+"\n"+str);
//            }
//        });
   //     piApi.question.add_qa(1, new Callback() {
//            @Override
//            public void onReceive(String str) {
//                TextView textView=findViewById(R.id.one);
//                try{
//                    JSONObject jsonObject=new JSONObject(str);
//                    JSONArray jsonArray=(JSONArray) jsonObject.get("content");
//
//                    String text="";
//                    for(int i=0;i<jsonArray.length();i++){
//                        JSONObject QA=(JSONObject) jsonArray.get(i);
//                        text+="\nQ:"+QA.get("question_text")+"\nA:"+QA.get("answer");
//                    }
//                    textView.setText(textView.getText()+"\n"+text);
//                }catch (JSONException ex){
//                    ex.printStackTrace();
//                }

//            }
//        });

        piApi.place.favorite_place(2, "房間", "123.123", "456.456", new Callback() {
            @Override
            public void onReceive(String str) {
                TextView textView=findViewById(R.id.one);
                try{
                    JSONObject jsonObject=new JSONObject(str);
                    JSONArray jsonArray=(JSONArray) jsonObject.get("content");

                    String text="";
                    for(int i=0;i<jsonArray.length();i++){
                        JSONObject QA=(JSONObject) jsonArray.get(i);
                        text+="\nQ:"+QA.get("question_text")+"\nA:"+QA.get("answer");
                    }
                    textView.setText(textView.getText()+"\n"+text);
                }catch (JSONException ex){
                    ex.printStackTrace();
                }

            }
        });

    }
}
