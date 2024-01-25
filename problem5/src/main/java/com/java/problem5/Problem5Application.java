package com.java.problem5;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Problem5Application {

	public static void main(String[] args) {
		Solution solution = new Solution();
		List<Integer> list =  Arrays.asList(1005, 1002, 1003, 1005, 1002, 1001, 1004, 1003, 1001, 1005, 1006, 1007, 1008, 1009);
		solution.dishPrepareOrder(list);
	}

}
