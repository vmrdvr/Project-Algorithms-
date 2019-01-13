package com.ravi.ds.stack;

import java.util.Arrays;

public class StackPushPop {
	
	final int MAX = 5;
	int top;
	int[] s = new int[MAX];
	public StackPushPop() {
		top=-1;
	}
	public static void main(String[] args) {
		
		
		StackPushPop stack = new StackPushPop();
		
		stack.push(10);
		stack.push(45);
		stack.push(12);
		stack.push(45);
		stack.push(47);
		stack.push(52);
		stack.pop();
		
		System.out.println(Arrays.toString(stack.s));
		stack.pop();
		System.out.println(Arrays.toString(stack.s));
		System.out.println(stack.isEmpty());
	}
	
	void push(int n){
		
		if(top>=MAX-1){
			System.out.println("Stack Overflow - Unable to push :" +n);
			return;
		}else{
			
			s[++top]=n;
			return;
		}
		
	}
	int pop(){
		
		if(top<0){
			System.out.println("No more elements in the Stack ");
			return 0;
		}else{
			
			int r = s[top--];
			System.out.println("popping " +r+" out of the stack");
			return r;
		}
		
	}
	boolean isEmpty(){
		
		return (top<0);
		
	}
}
