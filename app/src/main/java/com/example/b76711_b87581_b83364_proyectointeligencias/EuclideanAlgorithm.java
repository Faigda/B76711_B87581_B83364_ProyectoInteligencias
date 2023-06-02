package com.example.b76711_b87581_b83364_proyectointeligencias;

public class EuclideanAlgorithm {

    public EuclideanAlgorithm(){

    }

    public static int mcd(int a, int b) {
        if (b == 0) return a;
        return mcd(b, a % b);
    }

}
