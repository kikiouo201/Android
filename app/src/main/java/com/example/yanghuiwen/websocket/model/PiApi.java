package com.example.yanghuiwen.websocket.model;

public class PiApi {


    //child_id

   public Data data;
    public Place place;
    public Question question;
    public Translation translation;

    public PiApi(){
        super();
        data=new Data();
        place=new Place(data);
        question=new Question(data);
        translation=new Translation(data);
        data.allmodel(place,question,translation);
    }

}
