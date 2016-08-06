package ua.com.marami.gojavaonline3.view;

public class ConsoleWriter implements Writer {

	@Override
	public void writeString(String text) {
		System.out.println(text);
	}

	@Override
	public void writeInt(int number) {
		System.out.println(number);
	}
}
