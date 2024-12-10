package tp07_batch_Sumanth;

public class ConsecutiveCharactersFromString {

	public static void main(String[] args) {

		String s = "aaabbaabacc"; // Input string
		StringBuilder result = new StringBuilder();

		int count = 1; // Initialize count to 1 for the first character

		// Loop through the string
		for (int i = 0; i < s.length(); i++) {
			if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
				count++; // Increment the count for consecutive duplicate characters
			} else {
				result.append(s.charAt(i)).append(count); // Append character and its count
				count = 1; // Reset count for the next character
			}
		}

		// Output the result
		System.out.println(result.toString());
	}

}
/*
 * 
 */
