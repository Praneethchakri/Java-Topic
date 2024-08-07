package coreJava.collection.streams.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class ReplaceAll_Map {
	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();

			map.put("A", 1);
			map.put("B", 2);
			map.put("C", 3);
			map.put("D", 4);
			map.put("E", 5);
			
//			map.replaceAll((k,v)->(v%2==0)?6:3 );
			map.replaceAll((k,v)->(v%2==0)? v+0:v+1);
			System.out.println("Map ReplaceAll "+map);
			
			Map<String,Integer> studentScores = new HashMap<String,Integer>();
			
			studentScores.put("Praneeth", 90);
			studentScores.put("Sushma", 95);
			studentScores.put("Prajna", 93);
			studentScores.put("Diguvapalem", 96);
			studentScores.put("Chakravarthi", 94);
			
			 int maxScore = studentScores.values().stream().max(Integer::compare).orElse(100);
			 
			 System.out.println("Max Score "+maxScore);
			 studentScores.replaceAll((name,score)->(score*100)/maxScore);
			System.out.println("Normalized Map "+studentScores);
			
			
			
			Map<String,Integer> accountTrax = new HashMap<String,Integer>();
			
			accountTrax.put("Account1", 1902);
			accountTrax.put("Account2", 902);
			accountTrax.put("Account3", 192);
			accountTrax.put("Account4", 102);
			accountTrax.put("Account5", 190);
			
			
			Map<String,Integer> newAccountTrax = new HashMap<String,Integer>();
			
				newAccountTrax.put("Account1", -1902);
				newAccountTrax.put("Account2", 902);
				newAccountTrax.put("Account3", 800);
				newAccountTrax.put("Account4", 12);
				newAccountTrax.put("Account5", -90);
				System.out.println("Account Tranasctions  "+accountTrax);
				Map<String,Integer> anotherTrx = Map.of("Account1", 1902, "Account2", 902, "Account3", 800, "Account4", 12, "Account5", 100);
				accountTrax.replaceAll((account,balance)->balance+newAccountTrax.getOrDefault(account, 0)+anotherTrx.getOrDefault(account, 0));
				System.out.println("Account Tranasctions "+accountTrax);
			
				
				Map<String,String> map0 = new HashMap<String,String>();
				map0.put("User1", "Owner");
				map0.put("User2", "Owner");
				map0.put("User3", "Owner");
				map0.put("User4", "Owner");
				map0.put("User5", "Owner");
				map0.put("User6", "Owner");
				
//				int[] i = {0};
				AtomicInteger ai = new AtomicInteger(0);
				map0.replaceAll((userName,role)->role.concat(String.valueOf(ai.getAndIncrement())));
//				map0.replaceAll((userName,role)->role.concat(String.valueOf(i[0]++)));
				
				System.out.println("Map"+map0);
			
			
			
	}

}
