package befaster.solutions;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FizzBuzzTest {

    @Test
    public void number() {
        assertThat(FizzBuzz.fizzBuzz(1), equalTo("1"));
    }

    @Test
    public void fizz() {
        assertThat(FizzBuzz.fizzBuzz(3), equalTo("fizz"));
    }

    @Test
    public void buzz() {
        assertThat(FizzBuzz.fizzBuzz(5), equalTo("buzz"));
    }

    @Test
    public void fizzBuzz() {
        assertThat(FizzBuzz.fizzBuzz(15), equalTo("fizz buzz"));
    }
}
