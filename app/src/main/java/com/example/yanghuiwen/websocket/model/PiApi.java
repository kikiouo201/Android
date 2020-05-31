package com.example.yanghuiwen.websocket.model;

public class PiApi {


    //child_id

   public WSClient WSClient;
    public Place place;
    public Question question;
    public Translation translation;

    private PiApi(){
        super();
        WSClient = new WSClient();
        place=new Place(WSClient);
        question=new Question(WSClient);
        translation=new Translation(WSClient);
//        WSClient.allmodel(place,question,translation);
    }

    private static PiApi instance;
    public static PiApi getInstance() {
        if (instance != null) return instance;
        instance = new PiApi();
        return instance;
    }

}
