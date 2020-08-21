package com.example.yanghuiwen.websocket;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.yanghuiwen.websocket.model.Callback;
import com.example.yanghuiwen.websocket.model.WSClient;
import com.example.yanghuiwen.websocket.model.PiApi;
import com.example.yanghuiwen.websocket.model.Translation;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class MainActivity extends AppCompatActivity {
    WSClient socket;
    Translation translation;

    PiApi piApi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        piApi=PiApi.getInstance();


    }


    public void connect(View view) {
        String str="";
          piApi.question.show_child_position(1, new Callback() {
            @Override
            public void onReceive(String str) {
                TextView textView=findViewById(R.id.one);
                textView.setText(str);
            }
        });
//        ImageView imageView=findViewById(R.id.image87);
//        Drawable drawable=imageView.getDrawable();
//        piApi.question.add_picture_book(1,"name",drawable,"介紹", new Callback() {
//            @Override
//            public void onReceive(String str) {
//                TextView textView=findViewById(R.id.one);
//                textView.setText(str);
//            }
//        });

//        piApi.question.show_child_good_baby_day_value(1, new Callback() {
//            @Override
//            public void onReceive(String str) {
//                TextView textView=findViewById(R.id.one);
//                textView.setText(str);
//            }
//        });

//        piApi.question.show_child_good_baby_total_value(1, new Callback() {
//            @Override
//            public void onReceive(String str) {
//                TextView textView=findViewById(R.id.one);
//                textView.setText(str);
//            }
//        });

//        piApi.question.sign_in_parent("chichi88","chichi87", new Callback() {
//            @Override
//            public void onReceive(String str) {
//                TextView textView=findViewById(R.id.one);
//                textView.setText(str);
//            }
//        });

//        piApi.question.show_quiz_record(1,new Callback() {
//            @Override
//            public void onReceive(String str) {
//                TextView textView=findViewById(R.id.one);
//
//                try{
//                    JSONObject jsonObject=new JSONObject(str);
//                    JSONArray jsonArray =(JSONArray) jsonObject.get("content");
//
//
//                    textView.setText(textView.getText()+"\n"+jsonArray);
//                }catch (JSONException ex){
//                    ex.printStackTrace();
//                }
//            }
//        });
//
//        piApi.question.show_quiz_content(1,new Callback() {
//            @Override
//            public void onReceive(String str) {
//                TextView textView=findViewById(R.id.one);
//
//                try{
//                    JSONObject jsonObject=new JSONObject(str);
//                    JSONArray jsonArray =(JSONArray) jsonObject.get("content");
//
//                    textView.setText(textView.getText()+"\n"+jsonArray);
//                }catch (JSONException ex){
//                    ex.printStackTrace();
//                }
//            }
//        });
//
//        piApi.question.alter_parent(10,"晚安安", "goodnight87","goodnight88",new Callback() {
//            @Override
//            public void onReceive(String str) {
//                TextView textView=findViewById(R.id.one);
//
//                try{
//                    JSONObject jsonObject=new JSONObject(str);
//                    JSONObject jsonArray =(JSONObject) jsonObject.get("content");
//
//
//                    textView.setText(textView.getText()+"\n"+jsonArray);
//                }catch (JSONException ex){
//                    ex.printStackTrace();
//                }
//            }
//        });
//        piApi.question.add_parent("晚安", "goodnight88","goodnight87",new Callback() {
//            @Override
//            public void onReceive(String str) {
//                TextView textView=findViewById(R.id.one);
//
//                try{
//                    JSONObject jsonObject=new JSONObject(str);
//                    JSONObject jsonArray =(JSONObject) jsonObject.get("content");
//
//
//                    textView.setText(textView.getText()+"\n"+jsonArray);
//                }catch (JSONException ex){
//                    ex.printStackTrace();
//                }
//            }
//        });

//        piApi.question.alter_child(8,"魚魚我最大","","",new Callback() {
//            @Override
//            public void onReceive(String str) {
//                TextView textView=findViewById(R.id.one);
//
//                try{
//                    JSONObject jsonObject=new JSONObject(str);
//                    JSONObject jsonArray =(JSONObject) jsonObject.get("content");
//
//
//                    textView.setText(textView.getText()+"\n"+jsonArray);
//                }catch (JSONException ex){
//                    ex.printStackTrace();
//                }
//            }
//        });

//        piApi.question.delete_child(6, new Callback() {
//            @Override
//            public void onReceive(String str) {
//                TextView textView=findViewById(R.id.one);
//                try{
//                    JSONObject jsonObject=new JSONObject(str);
//                    JSONObject jsonArray =(JSONObject) jsonObject.get("content");
//
//
//                    textView.setText(textView.getText()+"\n"+jsonArray);
//                }catch (JSONException ex){
//                    ex.printStackTrace();
//                }
//            }
//        });

//        piApi.question.add_child(8,"暗黑風月","2000-10-20","https://img.4gamers.com.tw/ckfinder/images/Katy/TGS%202019/20190913-onepunchman-05.jpg?versionId=hWsZ623aSD5LtdOlG9pcDJqMAWYFX9Tz",new Callback() {
//            @Override
//            public void onReceive(String str) {
//                TextView textView=findViewById(R.id.one);
//                try{
//                    JSONObject jsonObject=new JSONObject(str);
//                    JSONObject jsonArray =(JSONObject) jsonObject.get("content");
//
//
//                    textView.setText(textView.getText()+"\n"+jsonArray);
//                }catch (JSONException ex){
//                    ex.printStackTrace();
//                }
//            }
//        });

//        piApi.question.show_child(8,new Callback() {
//            @Override
//            public void onReceive(String str) {
//                TextView textView=findViewById(R.id.one);
//                try{
//                    JSONObject jsonObject=new JSONObject(str);
//                    JSONArray jsonArray=(JSONArray) jsonObject.get("content");
//
//
//                    textView.setText(textView.getText()+"\n"+jsonArray);
//                }catch (JSONException ex){
//                    ex.printStackTrace();
//                }
//            }
//        });
//        piApi.question.add_book(1, "123知識本", "知識", new Callback() {
//            @Override
//            public void onReceive(String str) {
//                TextView textView=findViewById(R.id.one);
//                textView.setText(textView.getText()+"\n"+str);
//            }
//        });



//        piApi.question.delete_book(3, new Callback() {
//            @Override
//            public void onReceive(String str) {
//                TextView textView=findViewById(R.id.one);
//                textView.setText(textView.getText()+"\n"+str);
//            }
//        });
//        piApi.question.show_book(1, new Callback() {
//            @Override
//            public void onReceive(String str) {
//                TextView textView=findViewById(R.id.one);
//                try{
//                    JSONObject jsonObject=new JSONObject(str);
//                    JSONArray jsonArray=(JSONArray) jsonObject.get("content");
//
//                    String text="";
//                    for(int i=0;i<jsonArray.length();i++){
//                        JSONObject book=(JSONObject) jsonArray.get(i);
//                        text+="\n本子名:"+book.get("name")+"\n類別:"+book.get("category");
//                    }
//                    textView.setText(textView.getText()+"\n"+text);
//                }catch (JSONException ex){
//                    ex.printStackTrace();
//                }
//            }
//        });

//        piApi.question.show_book_content(1, new Callback() {
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

//        piApi.question.show_past_question(1, new Callback() {
//            @Override
//            public void onReceive(String str) {
//
//                //裡面放你要做的事
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
//
//                    textView.setText(textView.getText()+"\n"+text);
//                }catch (JSONException ex){
//                    ex.printStackTrace();
//                }
//            }
//        });

//        piApi.question.delete_past_question(23, new Callback() {
//            @Override
//            public void onReceive(String str) {
//                TextView textView=findViewById(R.id.one);
//                textView.setText(textView.getText()+"\n"+str);
//            }
//        });
//
//        piApi.question.add_book_content(1,22, new Callback() {
//            @Override
//            public void onReceive(String str) {
//
//            }
//        });
//        piApi.question.delete_book_content(12, new Callback() {
//            @Override
//            public void onReceive(String str) {
//                TextView textView=findViewById(R.id.one);
//                textView.setText(textView.getText()+"\n"+str);
//            }
//        });


//        piApi.question.add_qa(1,"奶吃吃是什麼?","一種甜味可食用果實，有大量的維他命C，俗語說：「一天一蘋果，醫生遠離我」。","","知識", new Callback() {
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


//        piApi.question.alter_book(3,"123yo知識本","", new Callback() {
//            @Override
//            public void onReceive(String str) {
//
//            }
//        });
//
//        piApi.question.alter_book_content(13,0, 22, new Callback() {
//            @Override
//            public void onReceive(String str) {
//
//            }
//        });

    }
}
