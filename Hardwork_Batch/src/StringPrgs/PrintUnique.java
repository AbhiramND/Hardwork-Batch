package StringPrgs;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class PrintUnique {

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
		char minChar = 0;
		int minCount = 0;
		for (Entry<Character, Integer> e : map.entrySet()) {
			if (e.getValue()== minCount) {
				minChar = e.getKey();
//				minCount=e.getValue();
			}
		}
		System.out.println(minChar);
	}
}
