package arrayPrgs;

public class Smallest123 {
	public static void main(String[] args) {
		int[] arr = {110, 25,1, 2, 3, 4, 8, 6, 10, };
		int fs = arr[arr.length-1];
		int ss = arr[arr.length-2];
		int ts = arr[arr.length-3];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < fs) {
				ts = ss;
				ss = fs;
				fs = arr[i];
			} else if (arr[i] < ss) {
				ts = ss;
				ss = arr[i];
			} else if (arr[i] < ts) {
				ts = arr[i];

			}
		}
		System.out.println(fs);
		System.out.println(ss);
		System.out.println(ts);

	}

}
