package tp07_batch_Sumanth;

import java.util.Arrays;

public class LeftRationOfArray {

	public static void main(String[] args) {
		String s= "I want to go to Bali";
		String [] str=s.split(" ");
		
		for (int i = 1; i <=6; i++) {
			String temp=str[0];
			for (int j = 1; j < str.length; j++) {
				str[j-1]=str[j];
			}
			str[str.length-1]=temp;
		}
		System.out.println(Arrays.toString(str));
	}
}
