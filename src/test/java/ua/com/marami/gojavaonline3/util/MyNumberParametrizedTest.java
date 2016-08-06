package ua.com.marami.gojavaonline3.util;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(value = Parameterized.class)
public class MyNumberParametrizedTest {

	@Parameter
	public int[] numbers;

	@Parameter(value = 1)
	public String text;

	@Parameterized.Parameters(name = "{index}: buy() is {1}")
	public static Iterable<Object[]> getParametrizedData() {
		return Arrays.asList(new Object[][]{
				{new int[]{1}, "1"},
				{new int[]{1, 10, -2}, "110-2"},
				{new int[]{0, 0}, "00"},
				{new int[0], ""},
				{new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE}, "2147483647-2147483648"}
		});
	}

	@Rule
	public final Timeout globalTimeout = Timeout.seconds(1);

	@Test
	public void testIntArrayToString() throws Exception {
		assertEquals(text, MyNumber.intArrayToString(numbers));
	}

}