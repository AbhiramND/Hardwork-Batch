package map;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Maps1 
{
	public static void main(String[] args) {
		String s="rajajinagar";
		LinkedHashMap<Character, Integer> l=new LinkedHashMap<Character, Integer>();
		
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if(l.containsKey(ch))
			{
				l.put(ch, l.get(ch)+1);
			
			}
			else 
			{
				
				l.put(ch, 1);
				
			}
		}
		for(Entry<Character, Integer> e:l.entrySet())
		{
			if(e.getValue()>1)
			{
			System.out.println( e.getKey()+" "+e.getValue());
			}
		}
	}

}
