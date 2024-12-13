package StringPrgs;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class PrintDuplicateUsingArray {
	public static void main(String[] args) {

		String[] arr= {"raju","akash","akash","pavan","hanamant","shankarao"};
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		for (String ch : arr) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		for (Entry<String, Integer> e : map.entrySet()) {
			if(e.getValue()>1)
			System.out.print(e.getKey()+" ");
		}
	}
	
}