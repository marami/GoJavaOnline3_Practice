package ua.com.marami.gojavaonline3.util;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(value = Parameterized.class)
public class MyNumberParametrizedTest {

	private int[] numbers = {1};
	private String text;

	@Rule
	public final Timeout globalTimeout = Timeout.seconds(1);

	public MyNumberParametrizedTest(int[] numbers, String text) {
		this.numbers = numbers;
		this.text = text;
	}

	@Parameterized.Parameters(name = "{index}: buy() is {1}")
	public static Iterable<Object[]> getParametrizedData() {
		return Arrays.asList(new Object[][]{
				{new int[]{1}, "1"},
				{new int[]{1, 10, -2}, "110-2"},
				{new int[]{0}, "0"},
				{new int[0], ""}
		});
	}

	@Test
	public void testIntArrayToString() throws Exception {
		assertEquals(text, MyNumber.intArrayToString(numbers));
	}

}