package tp07_batch_Sumanth;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class PrintDuplicate {
	public static void main(String[] args) {

		String s = "aabbabac";
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (char ch : s.toCharArray()) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
//				System.out.print(map.get(ch)+" ");
			}
		}
		System.out.println(map.keySet());
		for (Entry<Character, Integer> e : map.entrySet()) {
			System.out.print(e.getKey()+" ");
		}
	}

}
