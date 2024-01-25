package com.java.problem3.operations;

import java.lang.Math;

public class BasicCalculator {

    public static int Add(int x, int y){
        return Math.addExact(x, y);
    }

    public static int Subtract(int x, int y){
        return Math.subtractExact(x, y);
    }
    public static int Multiply(int x, int y){

        return Math.multiplyExact(x, y);
    }
    public static int Divide(int x, int y){
        return Math.floorDiv(x, y);
    }
    public static double PowerOf(int x, int y){
        return Math.pow(x, y);
    }
}
