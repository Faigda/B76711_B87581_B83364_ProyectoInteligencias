package com.example.b76711_b87581_b83364_proyectointeligencias;

public class Intelligence {

    private int code, score;
    private String name;

    public Intelligence(int code, String name){
        this.code = code;
        this.score = 0;
        this.name = name;
    }

    public void addScore(int score){
        this.score += score;
    }

    public int getCode(){
        return this.code;
    }

    public int getScore(){
        return this.score;
    }

    public String getName() {
        return this.name;
    }
}
