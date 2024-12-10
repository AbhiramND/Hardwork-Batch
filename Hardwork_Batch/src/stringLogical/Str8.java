package stringLogical;

public class Str8 {

	public static void main(String[] args) {
		String s = "my name is ram";
		String[] arr = s.split(" ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}

	}

}
