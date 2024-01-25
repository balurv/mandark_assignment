package com.java.problem1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Problem1Application {
	public static void main(String[] args) {
		int[] roi = {4,3,2,3,4,5,6,7,8,9, 10};
		Solution solution = new Solution();
		int longestWinningStreak = solution.getLongestWinningStreak(roi);
		int shortestLossingStreak = solution.getShortestLoosingStreak(roi);
	}
}
