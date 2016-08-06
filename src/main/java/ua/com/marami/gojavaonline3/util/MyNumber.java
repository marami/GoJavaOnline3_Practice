package ua.com.marami.gojavaonline3.util;

public class MyNumber {

	public static String intArrayToString(int[] numbers) {
		final StringBuilder builder = new StringBuilder();
		for (int number : numbers) {
			builder.append(number);
		}
		return builder.toString();
	}

	public static int[] numberToArray(int number) {
		int firstIndex = number >= 0 ? 0 : 1;
		return Integer.toString(number).substring(firstIndex).chars().map(c -> c -= '0').toArray();
	}

	public static int sumOfIntInArray(int[] numbers) {
		int result = 0;
		for(int number: numbers) {
			result += number;
		}
		return result;
	}

}
