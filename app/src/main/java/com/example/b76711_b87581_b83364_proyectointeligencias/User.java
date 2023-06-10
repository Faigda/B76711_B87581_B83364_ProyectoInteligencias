package com.example.b76711_b87581_b83364_proyectointeligencias;

import java.util.ArrayList;

public class User{

    private String name, principalIntelligence;
    private ArrayList<Intelligence> intelligences;

    private int distance;

    public User(String name){
        this.name = name;
        this.intelligences = new ArrayList<>();
        this.intelligences.add(new Intelligence("Espacial"));
        this.intelligences.add(new Intelligence("Musical"));
        this.intelligences.add(new Intelligence("Lingüístico-Verbal"));
        this.intelligences.add(new Intelligence("Lógico-Matemática"));
        this.intelligences.add(new Intelligence("Corporal-Cinestésica"));
        this.intelligences.add(new Intelligence("Intrapersonal"));
        this.intelligences.add(new Intelligence("Interpersonal"));
        this.intelligences.add(new Intelligence("Naturalista"));
        this.intelligences.add(new Intelligence("Existencial"));
        this.intelligences.add(new Intelligence("Creativa"));
        this.intelligences.add(new Intelligence("Emocional"));
        this.intelligences.add(new Intelligence("Colaborativa"));
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

    public void setPrincipalIntelligence(String principalIntelligence) {
        this.principalIntelligence = principalIntelligence;
    }

    public String getPrincipalIntelligence() {
        return principalIntelligence;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
