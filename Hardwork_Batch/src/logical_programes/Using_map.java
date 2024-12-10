package logical_programes;

import java.util.HashMap;
import java.util.Map;

public class Using_map 
{
	//Print_all_duplicate_elements_in_an _array
	
	public static void duplicate(int arr[])
	{
		Map<Integer, Integer> map = new HashMap<>();
		for (int num:arr)
		{
			if(map.containsKey(num))
			{
				
				map.put(num, map.get(num)+1);
				
			}
			else
			{
				map.put(num, 1);
				
			}
		}
		for(Map.Entry<Integer, Integer>entry:map.entrySet())
		{
			if(entry.getKey()>1)
			{
				System.out.println(entry.getKey());
			}
		}
	}

	public static void main(String[] args) 
	{
		int[]array= {1, 2, 3, 4, 2, 5, 6, 3};
		duplicate(array);
		
	}
	
}
