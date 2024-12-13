package arrayPrgs;

public class SecondLargest {
	public static void main(String[] args) {
		int[] arr = { -32, -45, -31, -5, -4, -67, -45, -32, -48, -96 };
		int sl = 0;
		int fl = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > fl) {

				sl = fl;
				fl = arr[i];
			} else if (arr[i] > sl) {
				sl = arr[i];
			}
		}
		System.out.println(sl);
	}
}
