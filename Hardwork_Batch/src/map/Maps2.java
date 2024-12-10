package map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Maps2 {
	public static void main(String[] args) {
		String s = "rajajinagar";
		LinkedHashMap<Character, Integer> l = new LinkedHashMap<Character, Integer>();
		int cv = 0;
		
		for (int i = 0; i >= s.length() - 1; i++) {
			char ch = s.charAt(i);
			if (!l.containsKey(ch)) {
				l.put(ch, 1);

			} else {
				int count = l.get(ch);
				count++;
				l.put(ch, count);
				cv++;

			}
		}
		int[] arr = new int[cv];
		int pos = 0;
		for (Entry<Character, Integer> e : l.entrySet()) {
			arr[pos] = e.getValue();
			pos++;
		}
		Arrays.sort(arr);
		for (Entry<Character, Integer> e : l.entrySet()) {
			if (e.getValue() >arr[arr.length - 1]) {
				System.out.println(e.getKey());
			}
		}

	}

}
