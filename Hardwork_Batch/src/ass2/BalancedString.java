package ass2;

import java.util.ArrayList;

public class BalancedString {

	public static void main(String[] args) {
		String s = "{}[]()";
		ArrayList<Character> list = new ArrayList<Character>();
		for (int i = 0; i <= s.length() - 1; i++) {
			if ((!list.isEmpty()) && ((s.charAt(i) == '}') && (list.get(list.size() - 1) == '{'))
					|| ((s.charAt(i) == ']') && (list.get(list.size() - 1) == '['))
					|| ((s.charAt(i) == ')') && (list.get(list.size() - 1) == '('))) {
				list.remove(list.size() - 1);
			} else {
				list.add(s.charAt(i));
			}
		}

		if (list.isEmpty()) {
			System.out.println("String is Balanced");
		} else {
			System.out.println("String is not Balanced");
		}
	}
}
