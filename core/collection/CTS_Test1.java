package core.collection;

import java.util.Scanner;
import java.util.Stack;

public class CTS_Test1 {

	public static boolean isBalance(String expression) {

		Stack<Character> stack = new Stack<>();
		int i =0;
		for (char ch : expression.toCharArray()) {
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			} else if (ch == ')' || ch == '}' || ch == ']') {
				if (stack.isEmpty() || !isMatchingPair(stack.pop(), ch)) {
					return false;
				}
			}
			
			System.out.println("Iteration "+i+": "+ stack);
					i++;
					
		}
		return stack.isEmpty();
	}

	private static boolean isMatchingPair(char openBrace, char closeBrace) {

		return (openBrace == '(' && closeBrace == ')' || openBrace == '{' && closeBrace == '}'
				|| openBrace == '[' && closeBrace == ']');
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		if (isBalance(s)) {
			System.out.println("Balanced");
		} else {
			System.out.println("not Balanced");
		}

	}

}
