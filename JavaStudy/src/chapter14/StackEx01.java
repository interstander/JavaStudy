package chapter14;

import java.util.Stack;

public class StackEx01 {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		
		stack.push("A");
		System.out.println(stack.peek());
		stack.push("B");
		System.out.println(stack.peek());
		stack.push("C");
		System.out.println(stack.peek());
		stack.push("D");
		System.out.println(stack.peek());
		stack.push("E");
		System.out.println(stack.peek());
		
		System.out.println("-----------------");
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}

}
