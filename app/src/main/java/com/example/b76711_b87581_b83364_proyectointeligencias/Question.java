package com.example.b76711_b87581_b83364_proyectointeligencias;

public class Question {

    private String question;
    private Intelligence intelligence;

    public Question(String question, Intelligence intelligence){
        this.question = question;
        this.intelligence = intelligence;
    }

    public String getQuestion(){
        return this.question;
    }

    public Intelligence getIntelligence(){
        return this.intelligence;
    }

}
