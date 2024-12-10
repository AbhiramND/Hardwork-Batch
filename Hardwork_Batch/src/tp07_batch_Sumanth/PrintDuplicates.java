package tp07_batch_Sumanth;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class PrintDuplicates {

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
		for (Entry<Character, Integer> e : map.entrySet()) {
			if (e.getValue() > 1) {
				System.out.println(e.getKey() + " " + e.getValue());
			}
		}
	}

}
