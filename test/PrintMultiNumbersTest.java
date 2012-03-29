
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PrintMultiNumbersTest {

    @Test
    public void should_print_789() {
        LCDNumber lcdNumber = new LCDNumber("789");
        String expected =
            " -  -  - \n" +
            "  || || |\n" +
            "    -  - \n" +
            "  || |  |\n" +
            "    -  - \n";
        assertThat(lcdNumber.print(), is(expected));
    }
}