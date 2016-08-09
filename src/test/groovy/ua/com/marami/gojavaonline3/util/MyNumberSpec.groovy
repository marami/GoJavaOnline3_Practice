package ua.com.marami.gojavaonline3.util

import spock.lang.Specification

import static org.hamcrest.CoreMatchers.equalTo
import static org.junit.Assert.assertThat

public class MyNumberSpec extends Specification {

    def test() {
        setup:
        int fInput = 0

        when:
        fInput = 22

        then:
        assertThat(MyNumber.numberToArray(fInput).toList(), equalTo([2, 2]))
    }

}


