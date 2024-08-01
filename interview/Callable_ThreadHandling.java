package medium.site.interview;

import java.util.Random;
import java.util.concurrent.Callable;

public class Callable_ThreadHandling implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {

		Random num = new Random();
		Integer i = num.nextInt(10);
		Thread.sleep(i * 1000);
		return i;
	}

}
