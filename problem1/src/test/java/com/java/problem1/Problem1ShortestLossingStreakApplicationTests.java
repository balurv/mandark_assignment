package com.java.problem1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Problem1ShortestLossingStreakApplicationTests {
    private Solution solution;
    int[] roi;
    @BeforeEach
    void createSolution(){
        solution = new Solution();
    }
    @Test
    void increasingOrder(){
        roi = new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10};
        int shortestLoosingStreak = solution.getShortestLoosingStreak(roi);
        Assertions.assertEquals(1, shortestLoosingStreak);
    }
    @Test
    void decreasingOrder(){
        roi = new int[]{4, 3, 2, 1, 0, -1, -2, -3};
        int shortestLoosingStreak = solution.getShortestLoosingStreak(roi);
        Assertions.assertEquals(8, shortestLoosingStreak);
    }
    @Test
    void constantOrder(){
        roi = new int[]{1,1,1,1,1,1,1,1,1};
        int shortestLoosingStreak = solution.getShortestLoosingStreak(roi);
        Assertions.assertEquals(1, shortestLoosingStreak);
    }

    @Test
    void mixedOrder(){
        roi = new int[] {5,1,2,3,3,3,4,5,3,3,2,1,3,4,8,9};
        int shortestLoosingStreak = solution.getShortestLoosingStreak(roi);
        Assertions.assertEquals(1, shortestLoosingStreak);
    }

    @Test
    void IncreaseAndSteady(){
        roi = new int[]{1,2, 4,5,8,9,10, 10 ,10, 11, 12, 12,12,12};
        int shortestLoosingStreak = solution.getShortestLoosingStreak(roi);
        Assertions.assertEquals(1, shortestLoosingStreak);
    }

    @Test
    void DecreaseAndSteady(){
        roi = new int[]{5,4,3,2,1,0,0,0,0,0,0,0,0};
        int shortestLossingStreak = solution.getShortestLoosingStreak(roi);
        Assertions.assertEquals(1, shortestLossingStreak);
    }

    @Test
    void constantAndDecreaseAndConstant(){
        roi = new int[]{1,1,1,1,1,0,-1,-1,-1};
        int shortestLossingStreak = solution.getShortestLoosingStreak(roi);
        Assertions.assertEquals(1, shortestLossingStreak);
    }

    @Test
    void decreaseTwo(){
        roi = new int[] {5,4,3,2,1,5,4};
        int shortestLossingStreak = solution.getShortestLoosingStreak(roi);
        Assertions.assertEquals(2, shortestLossingStreak);
    }

    @Test
    void decreaseThree(){
        roi = new int[]{5,4,3,2,5,3,1,0,-1,3,2,1};
        int shortestLossingStreak = solution.getShortestLoosingStreak(roi);
        Assertions.assertEquals(3, shortestLossingStreak);
    }
}
