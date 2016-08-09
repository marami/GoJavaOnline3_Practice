package ua.com.marami.gojavaonline3;

import ua.com.marami.gojavaonline3.dao.Reader;
import ua.com.marami.gojavaonline3.util.MyNumber;
import ua.com.marami.gojavaonline3.view.Writer;

public class SumOfDigitsApp {

	private static final String WELCOME = "\nHello! It is the task #2 from the course \"GoJavaOnline3\". Now we will count sum of digits.";
	private static final String ASK_NUMBER = "Type the number:";
	private static final String OUR_RESULT = "Sum of digits in number is:";

	private final Reader reader;
	private final Writer writer;

	private int number;
	private int sum;

	public SumOfDigitsApp(Reader reader, Writer writer) {
		this.reader = reader;
		this.writer = writer;
	}

	public void run() {
		welcome();
		askNumber();
		sum = MyNumber.sumOfIntInArray(MyNumber.numberToArray(number));
		showResult();
	}

	private void welcome() {
		writer.writeString(WELCOME);
	}

	private void askNumber() {
		writer.writeString(ASK_NUMBER);
		number = reader.getInt();
	}

	private void showResult() {
		writer.writeString(OUR_RESULT);
		writer.writeInt(sum);
	}

}
