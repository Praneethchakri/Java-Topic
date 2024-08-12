package functionalInterface.programs;

import java.util.function.Consumer;
import java.util.function.Function;

interface Adder {

	String add(Function<String, String> f);

	void add(Consumer<Integer> c);
}

public class LambdaFeatures implements Adder {

	public static void main(String[] args) {
		String s1 = "WelcomeJava";
		Runnable run1 = () -> System.out.println(s1);

		String s2 = "WelcomeJava";
		Runnable run2 = () -> System.out.println(s2.toUpperCase());
		run1.run();
		
		
		LambdaFeatures obj = new LambdaFeatures();
		String s = obj.add(a -> a + "Lambda");
		System.out.println(s);
	}

	@Override
	public String add(Function<String, String> f) {
		return f.apply("Welcome");
	}

	@Override
	public void add(Consumer<Integer> c) {
	}

}
