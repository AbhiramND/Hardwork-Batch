package logical_programes;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class DuplicatePrint {
	public static void main(String[] args) {

		String s = "progrming";
		LinkedHashMap<Character, Integer> l = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (l.containsKey(ch)) 
			{
				int count=l.get(ch);
				count++;
				l.put(ch, count);

			} else {
				
				l.put(ch, 1);
			}

		}
		for (Entry<Character, Integer> o : l.entrySet()) {
			if (o.getValue() > 1) {
				System.out.println(o.getKey() + " " + o.getValue());
			}

		}

	}

}
