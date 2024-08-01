package medium.site.interview;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Callable_ThreadImpl {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		FutureTask[] tasks = new FutureTask[10];

		for (int j = 0; j < 10; j++) {
			Callable<Integer> callable = new Callable_ThreadHandling();
			tasks[j] = new FutureTask<>(callable);

			Thread t = new Thread(tasks[j]);
			t.start();
		}

		for (int x = 0; x < 10; x++) {
			Object result = tasks[x].get();
			System.out.println("Result " + result);

		}

	}

}
