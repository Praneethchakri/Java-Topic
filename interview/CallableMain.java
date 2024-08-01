package medium.site.interview;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableMain {
	public static void main(String[] args) {

		ExecutorService executer = Executors.newSingleThreadExecutor();

		Callable<String> callableObject = new CallableInterface_task();

		Future<String> future = executer.submit(callableObject);

		String result;
		try {
			result = future.get();

			System.out.println("Results ~~~ "+ result);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}finally {
			executer.shutdown();
		}

	}

}
