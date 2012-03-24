import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LCDNumberTest {
    @Test
    public void should_print_0() {
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
    public void should_print_1() {
        LCDNumber lcdNumber = new LCDNumber("1");
        String expected =
                        "   \n" +
                        "  |\n" +
                        "   \n" +
                        "  |\n" +
                        "   \n";
        assertThat(lcdNumber.toString(), is(expected));
    }

    @Test
    public void should_print_2() {
        LCDNumber lcdNumber = new LCDNumber("2");
        String expected =
                        " - \n" +
                        "  |\n" +
                        " - \n" +
                        "|  \n" +
                        " - \n";
        assertThat(lcdNumber.toString(), is(expected));
    }

    @Test
    public void should_print_3() {
        LCDNumber lcdNumber = new LCDNumber("3");
        String expected =
                        " - \n" +
                        "  |\n" +
                        " - \n" +
                        "  |\n" +
                        " - \n";
        assertThat(lcdNumber.toString(), is(expected));
    }

    @Test
    public void should_print_4() {
        LCDNumber lcdNumber = new LCDNumber("4");
        String expected =
                        "   \n" +
                        "| |\n" +
                        " - \n" +
                        "  |\n" +
                        "   \n";
        assertThat(lcdNumber.toString(), is(expected));
    }

    @Test
    public void should_print_5() {
        LCDNumber lcdNumber = new LCDNumber("5");
        String expected =
                        " - \n" +
                        "|  \n" +
                        " - \n" +
                        "  |\n" +
                        " - \n";
        assertThat(lcdNumber.toString(), is(expected));
    }

    @Test
    public void should_print_6() {
        LCDNumber lcdNumber = new LCDNumber("6");
        String expected =
                        " - \n" +
                        "|  \n" +
                        " - \n" +
                        "| |\n" +
                        " - \n";
        assertThat(lcdNumber.toString(), is(expected));
    }

    @Test
    public void should_print_7() {
        LCDNumber lcdNumber = new LCDNumber("7");
        String expected =
                        " - \n" +
                        "  |\n" +
                        "   \n" +
                        "  |\n" +
                        "   \n";
        assertThat(lcdNumber.toString(), is(expected));
    }

    @Test
    public void should_print_8() {
        LCDNumber lcdNumber = new LCDNumber("8");
        String expected =
                        " - \n" +
                        "| |\n" +
                        " - \n" +
                        "| |\n" +
                        " - \n";
        assertThat(lcdNumber.toString(), is(expected));
    }

    @Test
    public void should_print_9() {
        LCDNumber lcdNumber = new LCDNumber("9");
        String expected =
                        " - \n" +
                        "| |\n" +
                        " - \n" +
                        "  |\n" +
                        " - \n";
        assertThat(lcdNumber.toString(), is(expected));
    }
}
