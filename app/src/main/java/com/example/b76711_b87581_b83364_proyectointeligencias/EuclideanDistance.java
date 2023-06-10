package com.example.b76711_b87581_b83364_proyectointeligencias;

public class EuclideanDistance {

    public EuclideanDistance(){

    }

    public int getEuclideanDistance(User userA, User userB){

        int distance = 0;

        for(int i = 0; i<userA.getIntelligence().size(); i++){
            distance += Math.pow(userA.getIntelligence().get(i).getScore()-userB.getIntelligence().get(i).getScore(), 2);
        }

        return (int)Math.sqrt(distance);
    }

}
