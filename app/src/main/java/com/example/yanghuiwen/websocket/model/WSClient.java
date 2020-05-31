package com.example.yanghuiwen.websocket.model;

import android.util.Log;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.drafts.Draft_6455;
import org.java_websocket.handshake.ServerHandshake;
import org.json.JSONException;
import org.json.JSONObject;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;


public class WSClient {

    JSONObject answer=new JSONObject();
    int onoff=0;
//    Place place;
//    Question question;
//    Translation translation;
    ArrayList<Callback> workqueue;

    private WebSocketClient webSocketClient;

    public WSClient(){
        super();
        try {
            connetToServer();
        } catch (Exception e) {
            e.printStackTrace();
        }
        workqueue=new ArrayList<Callback>();
    }


    private void connetToServer() throws InterruptedException {

        try {
            //ws://10.0.2.2:2000
            //ws://growup.mcu.yokikiyo.space
            webSocketClient = new WebSocketClient(new URI("ws://growup.mcu.yokikiyo.space"), new Draft_6455() {},null,100000) {
                @Override
                public void onOpen(ServerHandshake handshakedata) {
                    Log.i("view","connetToServer");
                }
                @Override
                public void onMessage(String message) {
                    try{
                        JSONObject jsonObject=new JSONObject(message);
                        String event=jsonObject.get("event").toString();
                        Log.i("kiki","event="+event);
                        for (int i=0;i<workqueue.size();i++){
                            Callback work=workqueue.get(i);

                            if(work.event.equals(event)){
                                workqueue.remove(i);
                                work.onReceive(message);
                                break;
                            }

                        }
//
                    }catch (JSONException e){
//
                        e.printStackTrace();
                    }

                }
                @Override
                public void onClose(int code, String reason, boolean remote) {
//                    TextView one=findViewById(R.id.three);
//                    one.setText("close");
                }
                @Override
                public void onClosing(int code, String reason, boolean remote) {
                    super.onClosing(code, reason, remote);
                }
                @Override
                public void onError(Exception ex) {
                    ex.printStackTrace();
                }
            };
            webSocketClient.connectBlocking();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

//    public void allmodel(Place place,Question question,Translation translation){
//     this.place=place;
//     this.question=question;
//     this.translation=translation;
//    }



    public void sendToServer(String event,JSONObject content,Callback callback){


        try {
            JSONObject jsonObject=new JSONObject();
            jsonObject.put("event",event);
            jsonObject.put("content",content);
            String str=jsonObject.toString();
            webSocketClient.send(str);
            callback.event=event;
            workqueue.add(callback);

        } catch (JSONException e) {

            e.printStackTrace();
        }

    }

    public void closeToServer(){
        webSocketClient.close();
    }

}
