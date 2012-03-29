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
            "abbcabbc"
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
                "1",
                "2",
                "2",
                "3",
                "4",
                "4",
                "5"
        };
        assertThat(scaler.scale(lines), is(expected));
    }
}
