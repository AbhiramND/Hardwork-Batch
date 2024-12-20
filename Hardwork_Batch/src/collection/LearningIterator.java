package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class LearningIterator {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Lucknow");
		list.add("Chennai");
		list.add("Hydrabad");
		list.add("bangalore");
		list.add("Bhuvneshwar");
		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		ListIterator itr = list.listIterator(5);
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());

		}
	}
}
