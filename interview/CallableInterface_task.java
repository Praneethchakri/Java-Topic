package medium.site.interview;

import java.util.concurrent.Callable;

public class CallableInterface_task implements Callable<String>{

	@Override
	public String call() throws Exception {
		Thread.sleep(10000);
		return "Called the call method in Callable Interface impelemtnation class...!!!";
	}
}
