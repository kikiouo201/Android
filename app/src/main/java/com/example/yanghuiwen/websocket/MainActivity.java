package com.example.yanghuiwen.websocket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
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

        piApi.question.show_book_content(1, new Callback() {
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

//        piApi.question.add_book_content(1,17, new Callback() {
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
