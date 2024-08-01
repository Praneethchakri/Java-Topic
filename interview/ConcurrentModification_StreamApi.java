package medium.site.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.stream.IntStream;

public class ConcurrentModification_StreamApi {
	
	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		
			IntStream.range(0, 100).forEach(number-> map.put(number,"Value "+number));
		
			
			List<Callable<Void>> list = new ArrayList<Callable<Void>>();
		
		
		
	}

}
