package lambdaExpression;

import java.util.ArrayList;

public class A1 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Lotus");
		list.add("Lily");
		list.add("Rose");
		list.add("SunFlower");

		list.forEach((x) -> System.out.println(x));
	}
}
