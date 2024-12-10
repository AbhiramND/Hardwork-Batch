package arrays;

public class RotateTheArray {
	 public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5};
	        int rotations = 2;
	        arr = rotate(arr, rotations);
	        for (int i : arr) {
	            System.out.print(i + " ");
	        }
	    }

	    public static int[] rotate(int[] arr, int rotations) {
	        rotations = rotations % arr.length;
	        int[] rotatedArray = new int[arr.length];
	        for (int i = 0; i < arr.length; i++) {
	            rotatedArray[(i + rotations) % arr.length] = arr[i];
	        }
	        return rotatedArray;
	    }

}
