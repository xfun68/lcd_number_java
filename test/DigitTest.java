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

    @Test
    public void first_line_should_be_two_dashes_when_size_is_2() {
        Digit digit = new Digit("9", 2);
        assertThat(digit.line_at(0), is(" -- "));
    }

    @Test
    public void fourth_line_should_be_two_dashes_when_size_is_2() {
        Digit digit = new Digit("9", 2);
        assertThat(digit.line_at(3), is(" -- "));
    }

    @Test
    public void count_of_lines_should_be_5_when_size_is_1() {
        Digit digit = new Digit("9");
        assertThat(digit.count_of_lines(), is(5));
    }

    @Test
    public void count_of_lines_should_be_5_when_size_is_2() {
        Digit digit = new Digit("9", 2);
        assertThat(digit.count_of_lines(), is(7));
    }
}
