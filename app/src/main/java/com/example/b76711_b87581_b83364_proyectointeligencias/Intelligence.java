package com.example.b76711_b87581_b83364_proyectointeligencias;

public class Intelligence {

    private int score;
    private String name;

    public Intelligence(String name){
        this.score = 0;
        this.name = name;
    }

    public void addScore(int score){
        this.score += score;
    }

    public int getScore(){
        return this.score;
    }

    public String getName() {
        return this.name;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
