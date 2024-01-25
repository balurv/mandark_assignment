package com.java.problem1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Problem1LongestWinningStreakApplicationTests {
	private Solution solution;
	private int[] roi;
	@BeforeEach
	void createSolution() {
		solution = new Solution();
	}
	@Test
	void increasingOrder() {
		roi = new int[]{ 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int longestWinningStreak = solution.getLongestWinningStreak(roi);
		Assertions.assertEquals(9, longestWinningStreak);
	}
/*
	Even in the each and every year there is decrease of roi
	at least the first year is considered as winning streak;
 */
	@Test
	void decreasingOrder(){
		roi = new int[]{4, 3, 2, 1, 0, -1, -2, -3};
		int longestWinningStreak = solution.getLongestWinningStreak(roi);
		Assertions.assertEquals(1, longestWinningStreak);
	}

//	Assumption:
//	I have considered even there is no growth in roi as winning streak
//	Even same for the above cases also.
	@Test
	void constantOrder(){
		roi = new int[]{1,1,1,1,1,1,1,1,1,1};
		int longestWinningStreak = solution.getLongestWinningStreak(roi);
		Assertions.assertEquals(10, longestWinningStreak);
	}

	@Test
	void mixedOrder(){
		roi = new int[]{5,1,2,3,3,3,4,5,3,3,2,1,3,4,8,9};
		int longestWinningStreak = solution.getLongestWinningStreak(roi);
		Assertions.assertEquals(7, longestWinningStreak);
	}

	@Test
	void increaseAndSteady(){
		roi = new int[] {1,2, 4,5,8,9,10, 10 ,10, 11, 12, 12,12,12};
		int longestWinningStreak = solution.getLongestWinningStreak(roi);
		Assertions.assertEquals(14, longestWinningStreak);
	}

	@Test
	void decreaseAndSteady(){
		roi = new int[]{5,4,3,2,1,0,0,0,0,0,-1};
		int longestWinningStreak = solution.getLongestWinningStreak(roi);
		Assertions.assertEquals(5, longestWinningStreak);
	}
}
