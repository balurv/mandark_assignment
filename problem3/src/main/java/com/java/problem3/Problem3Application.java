package com.java.problem3;

import com.java.problem3.useraction.Actions;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class Problem3Application {

	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		initiateCalculator();
	}

	public static void initiateCalculator(){
		int operator = Integer.parseInt(sc.nextLine());
		Actions action = Actions.getActionsByIndex(operator-1);
		try {
			assert action != null;
			action.perform();
		}catch (Exception e){
			System.out.println("Invalid input! Please try again!");
		}String key = sc.nextLine();
		if(key.equals("n")){
			initiateCalculator();
		}
		System.exit(1);
	}

}
