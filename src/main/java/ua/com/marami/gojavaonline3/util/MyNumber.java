package ua.com.marami.gojavaonline3.util;

public class MyNumber {

	public static String intArrayToString(int[] numbers) {
		final StringBuilder builder = new StringBuilder();
		for (int number: numbers) {
			builder.append(number);
		}
		return builder.toString();
	}

}
