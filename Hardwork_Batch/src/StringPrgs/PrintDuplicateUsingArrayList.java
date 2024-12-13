package StringPrgs;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class PrintDuplicateUsingArrayList {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("raju");
		list.add("raju");
		list.add("rahul");
		list.add("akash");
		list.add("pavan");
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		for (String ch : list) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);

	}
}