package com.java.problem4;
public class Problem4Application {

	public static void main(String[] args) {
		Lifo<Integer> stack = new CustomStack<>();
		stack.push(1);
		stack.push(2);
		stack.push(5);
		System.out.println("size:"+stack.size());
		System.out.println("top:"+stack.top());
		stack.pop();
		System.out.println("top:"+stack.top());
		stack.pop();
		System.out.println("top:"+stack.top());
		System.out.println("size:"+stack.size());
		stack.pop();
		try {
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			System.out.println("top:"+stack.top());
		}
		catch (Exception e){
			e.printStackTrace();
		}
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println("finally "+stack.size());
	}

}
