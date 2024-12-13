package StringPrgs;

import java.util.LinkedHashMap;

public class NoOfOccuranceInArray {
public static void main(String[] args) {
		
		int[] s= {1,2,5,1,4,6,7};
		LinkedHashMap<Integer, Integer> map=new LinkedHashMap<Integer, Integer>();
		for(int ch:s) {
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
