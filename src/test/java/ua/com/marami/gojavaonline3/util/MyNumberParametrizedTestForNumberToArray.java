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

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(value = Parameterized.class)
public class MyNumberParametrizedTestForNumberToArray {

	@Parameter
	public int fInput;

	@Parameter(value = 1)
	public int[] fExpected;

	@Parameters(name = "{index}: fInput = {0}")
	public static Collection<Object[]> getParametrizedData() {
		return Arrays.asList(new Object[][]{
				{22, new int[]{2, 2}},
				{0, new int[]{0}},
				{-1, new int[]{1}},
				{-954, new int[]{9, 5, 4}}
		});
	}

	@Rule
	public final Timeout globalTimeout = Timeout.seconds(1);

	@Test
	public void numberToArray() throws Exception {
		assertThat(MyNumber.numberToArray(fInput), equalTo(fExpected));
	}

}