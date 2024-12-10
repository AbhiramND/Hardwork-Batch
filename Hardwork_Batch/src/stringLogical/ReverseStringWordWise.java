package stringLogical;

public class ReverseStringWordWise {

	public static void main(String[] args) {
		String s="my name is super star mb";
		String [] arr=s.split(" ");
		String rev="";
		for(int i=arr.length-1;i>=0;i--)
		{
			rev=rev+arr[i]+" ";
		}
		System.out.println(rev);

	}

}
