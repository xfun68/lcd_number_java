import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ScalerTest {

    @Test
    public void abc_should_be_abbc_when_scale_is_2() {
        Scaler scaler = new Scaler(2);
        String[] lines = {
            "abcabc"
        };
        String[] expected = {
            "aabbccaabbcc",
            "aabbccaabbcc"
        };
        assertThat(scaler.scale(lines), is(expected));
    }

    @Test
    public void five_lines_should_be_scaled_to_seven_lines() {
        Scaler scaler = new Scaler(2);
        String[] lines = {
                "1",
                "2",
                "3",
                "4",
                "5"
        };
        String[] expected = {
                "11",
                "11",
                "22",
                "22",
                "33",
                "33",
                "44",
                "44",
                "55",
                "55"
        };
        assertThat(scaler.scale(lines), is(expected));
    }
}
