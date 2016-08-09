package ua.com.marami.gojavaonline3.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

@RunWith(value = Parameterized.class)
public class MyNumberTestParametrizedTestForSumOfIntInArray {

	@Parameter
	public int[] fInput;

	@Parameter(value = 1)
	public int fExpected;

	//TODO exception for overLimit
	@Parameters
	public static Collection<Object[]> getParametrizedData() {
		return Arrays.asList(new Object[][]{
				{new int[]{1}, 1},
				{new int[]{0}, 0},
				{new int[]{1, 0, -2}, -1},
				{new int[]{0, 0, 0}, 0}
//				{new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE}, 0}
		});
	}


	@Test
	public void sumOfIntInArray() throws Exception {
		assertEquals(fExpected, MyNumber.sumOfIntInArray(fInput));
		assertThat(MyNumber.sumOfIntInArray(fInput), is(fExpected));
	}

}