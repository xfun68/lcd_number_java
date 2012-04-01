import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PrintBiggerNumberTest {

    @Test
    public void should_print_99_in_size_2() {
        LCDNumber lcdNumber = new LCDNumber("99", 2);
        String expected =
            "  --    --  \n" +
            "  --    --  \n" +
            "||  ||||  ||\n" +
            "||  ||||  ||\n" +
            "  --    --  \n" +
            "  --    --  \n" +
            "    ||    ||\n" +
            "    ||    ||\n" +
            "  --    --  \n" +
            "  --    --  \n";
        assertThat(lcdNumber.print(), is(expected));
    }
}
