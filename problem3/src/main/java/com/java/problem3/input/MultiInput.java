package com.java.problem3.input;
import java.util.Scanner;

public class MultiInput {
    private int x=0;
    private int y=0;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static int[] UserInput(){
        MultiInput input = new MultiInput();
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

        while(isInt){
            try{
                input.setY(Integer.parseInt(sc.nextLine()));
                isInt = false;
            }
            catch(NumberFormatException ignored){
            }
        }

        int[] variables = new int[2];
        variables[0] = input.getX();
        variables[1] = input.getY();


        return variables;
    }
}
