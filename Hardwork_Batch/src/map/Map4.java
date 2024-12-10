package map;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Map4 
{
	public static void main(String[] args) {
		String s = "rajajinagara";
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
		int maxcount = 1;
		

		for (Entry<Character, Integer> o : l.entrySet()) {
			if (o.getValue() > maxcount) 
			{
				System.out.println(o.getKey()+ " " + o.getValue());
			}
		}
		

	}
	

}
