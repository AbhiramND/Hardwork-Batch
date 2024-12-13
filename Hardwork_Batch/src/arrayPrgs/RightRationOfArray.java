package arrayPrgs;

import java.util.Arrays;

public class RightRationOfArray {

	public static void main(String[] args) {
		String s= "I want to go to dehli";
		String [] str=s.split(" ");
		String temp=str[str.length-1];
//		for (int i = 4; i <=1; i++) {
			
			for (int j = str.length-2; j >=0; j--) {
				str[j+1]=str[j];
			}
			str[0]=temp;
//		}
		System.out.println(Arrays.toString(str));
	}
}
