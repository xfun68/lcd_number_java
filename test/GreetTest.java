import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GreetTest {
    @Test
    public void should_say_hello() {
        assertThat(new Greet().say(), is("Hello!"));
    }
}
