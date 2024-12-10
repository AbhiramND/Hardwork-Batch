package collection;

import java.util.Vector;

public class Vector7 
{
	public static void main(String[] args) 
	{
		Vector l1=new Vector();
		l1.add("Mandya");
		l1.add("Mysore");
		l1.add("Bangalore");
		l1.add("shivamoga");
		l1.add("hubli");
		l1.add("kalaburagi");
		l1.add("yadagiri");
		l1.add("davanageri");
		
		l1.remove("Mandya");
		System.out.println(l1);
		
		l1.remove(3);
		System.out.println(l1);
		
		

	}

}
