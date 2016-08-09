package ua.com.marami.gojavaonline3.util;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(value = Parameterized.class)
public class MyNumberParametrizedTestForIntArrayToString {

	@Parameter
	public int[] fInput;

	@Parameter(value = 1)
	public String fExpected;

	@Parameters(name = "{index}: buy() is \"{1}\"")
	public static Collection<Object[]> getParametrizedData() {
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
		assertThat(MyNumber.intArrayToString(fInput), is(fExpected));
	}

}