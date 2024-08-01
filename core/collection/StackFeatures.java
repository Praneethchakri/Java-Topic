package core.collection;

import java.util.Stack;

public class StackFeatures {
	public static void main(String[] args) {

		Stack<Character> stack = new Stack<>();
		stack.add('A');
		stack.add('B');
		stack.add('C');
		stack.add('D');
		stack.add('E');
		stack.add('F');

		System.out.println(stack);
		
//		System.out.println(stack.pop());
		char pop = stack.pop();
		System.out.println(pop);
		System.out.println(stack);
		char peek = stack.peek();
		System.out.println(peek);
		System.out.println(stack);
	}

}
