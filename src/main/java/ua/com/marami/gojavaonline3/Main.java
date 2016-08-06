package ua.com.marami.gojavaonline3;

import ua.com.marami.gojavaonline3.dao.ConsoleReader;
import ua.com.marami.gojavaonline3.dao.Reader;
import ua.com.marami.gojavaonline3.view.ConsoleWriter;
import ua.com.marami.gojavaonline3.view.Writer;

public class Main {

    public static void main(String[] args) {
        Reader reader = new ConsoleReader();
        Writer writer = new ConsoleWriter();

        Task1 task1 = new Task1(reader, writer);
        task1.run();
    }
}
