package ua.com.marami.gojavaonline3;

import ua.com.marami.gojavaonline3.dao.Reader;
import ua.com.marami.gojavaonline3.util.MyNumber;
import ua.com.marami.gojavaonline3.view.Writer;

public class Task1 {

	private static final String WELCOME = "Hello! It is the task #1 from the course \"GoJavaOnline3\". Now we will convert an integer array to String.";
	private static final String ASK_LENGTH = "Length of array:";
	private static final String ASK_NUMBERS = "Type numbers:";
	private static final String OUR_RESULT = "Resulted String is:";

	private final Reader reader;
	private final Writer writer;

	private int[] numbers;
	private String resultedText;

	public Task1(Reader reader, Writer writer) {
		this.reader = reader;
		this.writer = writer;
	}

	public void run() {
		welcome();
		initializeArray();
		intArrayToString();
		showResult();
	}

	private void welcome() {
		writer.writeString(WELCOME);
	}

	private void initializeArray() {
		writer.writeString(ASK_LENGTH);
		int amount = reader.getInt();

		writer.writeString(ASK_NUMBERS);
		numbers = new int[amount];
		for (int i = 0; i < amount; i++) {
			numbers[i] = reader.getInt();
		}
	}

	private void intArrayToString() {
		resultedText = MyNumber.intArrayToString(numbers);
	}


	private void showResult() {
		writer.writeString(OUR_RESULT);
		writer.writeString(resultedText);
	}

}
