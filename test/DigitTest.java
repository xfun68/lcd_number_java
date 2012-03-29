import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DigitTest {

    @Test
    public void should_return_first_line() {
        Digit digit = new Digit("9");
        assertThat(digit.line_at(0), is(" - "));
    }

    @Test
    public void should_return_second_line() {
        Digit digit = new Digit("9");
        assertThat(digit.line_at(1), is("| |"));
    }
}
