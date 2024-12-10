package map;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class ScannerClassOnMap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		LinkedHashMap<Character, Integer> l = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i <= s.length() - 1; i++) {
			char ch = s.charAt(i);
			if (!l.containsKey(ch)) {
				l.put(ch, 1);
			} else {
				int count = l.get(ch);
				count++;
				l.put(ch, count);
			}
		}
		int maxcount = sc.nextInt();
		char maxchar = sc.next().charAt(maxcount);
		for (Entry<Character, Integer> o : l.entrySet()) {
			if (o.getValue() > maxcount) {
				maxcount = o.getValue();
				maxchar = o.getKey();

			}

		}
		System.out.println(maxcount + " " + maxchar);

	}

}
