package com.java.problem2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Problem2Application {

	public static void main(String[] args) {
		int[] nums = { 1, 4, 6, 2, 8, 8 ,10};
		int target = 10;
		Solution solution = new Solution();
		int res[] = solution.getPairs(nums, target);
	}

}
