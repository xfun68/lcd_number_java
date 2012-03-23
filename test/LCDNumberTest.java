import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LCDNumberTest {
    @Test
    public void should_print_single_number_0_in_digit_style() {
        LCDNumber lcdNumber = new LCDNumber("0");
        String expected =
                " - \n" +
                "| |\n" +
                "   \n" +
                "| |\n" +
                " - \n";
        assertThat(lcdNumber.toString(), is(expected));
    }

    @Test
    public void should_print_single_number_1_in_digit_style() {
        LCDNumber lcdNumber = new LCDNumber("1");
        String expected =
                "   \n" +
                "  |\n" +
                "   \n" +
                "  |\n" +
                "   \n";
        assertThat(lcdNumber.toString(), is(expected));
    }
}
