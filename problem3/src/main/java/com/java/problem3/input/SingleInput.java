package com.java.problem3.input;
import java.util.Scanner;

public class SingleInput {
    private int x=0;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public static int UserInput(){
        SingleInput input = new SingleInput();
        Scanner sc = new Scanner(System.in);
        boolean isInt = false;
        while(!isInt){
            try{
                input.setX(Integer.parseInt(sc.nextLine()));
                isInt = true;
            }
            catch(NumberFormatException ignored){
            }
        }

        return input.getX();
    }
}
