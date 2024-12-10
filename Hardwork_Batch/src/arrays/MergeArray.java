package arrays;

import java.util.Arrays;

public class MergeArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] abb = { 5, 6, 7, 8, 9 };
		int size=arr.length+abb.length;
		int [] acc=new int[size];
		int pos=0;
		for(int a:arr)
		{
			acc[pos]=a;
			pos++;
		}
		for(int a:abb)
		{
			acc[pos]=a;
			pos++;
		}
		System.out.println(Arrays.toString(acc));
		for(int a:acc)
		{
			System.out.print(a+" ");
		}
	}

}
