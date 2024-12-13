package StringPrgs;

import java.util.LinkedHashMap;

public class NoOfOccuranceInWords {

public static void main(String[] args) {
		
		String s="my name is raju is name";
		String[] s1=s.split(" ");
		LinkedHashMap<String, Integer> map=new LinkedHashMap<String, Integer>();
		for(String ch:s1) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
	}
}
