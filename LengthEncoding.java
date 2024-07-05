package com.prep;

/*
 * Implement a run length encoding function.
 * For a string input the function returns output encoded as follows:
 *
 * "a"     -> "a1"
 * "aa"    -> "a2"
 * "aabbb" -> "a2b3"
 */
public class LengthEncoding {

	public static String rle(String input) {
		if (input.isEmpty()) {
			return "";
		}
		String out = "";

		for (int i = 0; i < input.length(); i++) {
			char current = input.charAt(i);
			int length = 0;
			String outPut = "";
			for (int j = i; j < input.length(); j++) {
				if (current == input.charAt(j)) {
					length++;
					i++;
					outPut =  current + String.valueOf(length);

				} else {
					i = j - 1;
					break;

				}

			}
			out += outPut;

		}
		System.out.println(out);
		return out;

	}

	public static void main(String[] args) {

		if ("a2b3".equals(rle("aabbb"))) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}
	}
}
