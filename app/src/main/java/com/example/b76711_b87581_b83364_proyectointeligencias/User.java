package com.example.b76711_b87581_b83364_proyectointeligencias;

import java.util.ArrayList;

public class User{

    private String name;
    private ArrayList<Intelligence> intelligences;

    public User(String name){
        this.name = name;
        this.intelligences = new ArrayList<>();
        this.intelligences.add(new Intelligence(1, "Espacial"));
        this.intelligences.add(new Intelligence(2, "Musical"));
        this.intelligences.add(new Intelligence(3, "Lingüístico-Verbal"));
        this.intelligences.add(new Intelligence(4, "Lógico-Matemática"));
        this.intelligences.add(new Intelligence(5, "Corporal-Cinestésica"));
        this.intelligences.add(new Intelligence(6, "Intrapersonal"));
        this.intelligences.add(new Intelligence(7, "Interpersonal"));
        this.intelligences.add(new Intelligence(8, "Naturalista"));
        this.intelligences.add(new Intelligence(9, "Existencial"));
        this.intelligences.add(new Intelligence(10, "Creativa"));
        this.intelligences.add(new Intelligence(11, "Emocional"));
        this.intelligences.add(new Intelligence(12, "Colaborativa"));
    }

    public void setIntelligence(ArrayList<Intelligence> intelligences) {
        this.intelligences = intelligences;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Intelligence> getIntelligence() {
        return this.intelligences;
    }
}
