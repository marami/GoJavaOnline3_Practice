package ua.com.marami.gojavaonline3;

import ua.com.marami.gojavaonline3.dao.ConsoleReader;
import ua.com.marami.gojavaonline3.dao.Reader;
import ua.com.marami.gojavaonline3.view.ConsoleWriter;
import ua.com.marami.gojavaonline3.view.Writer;

public class Main {

    public static void main(String[] args) {
        Reader reader = new ConsoleReader();
        Writer writer = new ConsoleWriter();

        MergerOfDigitsApp mergerOfDigitsApp = new MergerOfDigitsApp(reader, writer);
        mergerOfDigitsApp.run();

        SumOfDigits sumOfDigits = new SumOfDigits(reader, writer);
        sumOfDigits.run();
    }
}
