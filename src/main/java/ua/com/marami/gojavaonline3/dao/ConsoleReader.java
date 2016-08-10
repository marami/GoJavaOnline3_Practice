package ua.com.marami.gojavaonline3.dao;

import java.util.Scanner;

public class ConsoleReader implements Reader {

	private final Scanner scanner = new Scanner(System.in);

	@Override
	public int getInt() {
		while(true) {
			if(scanner.hasNextInt()) {
				return scanner.nextInt();
			} else {
				scanner.next();
			}
		}
	}

	@Override
	public void close() {
		scanner.close();
	}
}
