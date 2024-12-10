package map;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Map5 {
	public static void main(String[] args) {
		String s="rajajinagar";
		char[]arr=s.toCharArray();
		LinkedHashMap<Character, Integer> l=new LinkedHashMap<Character, Integer>();
		for (char c : arr) {
			if(!l.containsKey(c))
			{
				l.put(c, 1);
			}
			else {
				int count=l.get(c);
				count++;
				l.put(c, count);
			}
		}
		Character key = 0;
		 Integer val = 0;
		
		for (Entry<Character, Integer> o : l.entrySet()) {
			if(o.getValue()>val)
			{
				key = o.getKey();
				val = o.getValue();
			}
			
		}
		System.out.println(key +" "+ val);
	}
}
