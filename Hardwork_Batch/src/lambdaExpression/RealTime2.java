package lambdaExpression;

import java.util.Collections;
import java.util.HashMap;

public class RealTime2 {
	public static void main(String[] args) {
		HashMap list = new HashMap();
		list.put("Dhoni",7);
		list.put("Kohli" ,18);
		list.put("Rohit",45);
		

		list.forEach((x,y) -> System.out.println(x+","+y));
		
	}
}
