package tp07_batch_Sumanth;

import java.util.LinkedHashMap;

public class OccuranceACharactor {
/*
 * Map ---> key ,value
 * a-4
 * b-3
 * c-3
 * 
 * LinkendHahMap
 * aabbabac
 * 
 * a-4
 * b-3
 * c-1
 */
	public static void main(String[] args) {
		
		String s="aabbabac";
		LinkedHashMap<Character, Integer> map=new LinkedHashMap<Character, Integer>();
		for(char ch:s.toCharArray()) {
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
