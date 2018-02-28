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
        assertThat(FizzBuzz.fizzBuzz(31), equalTo("fizz"));
    }

    @Test
    public void buzz() {
        assertThat(FizzBuzz.fizzBuzz(50), equalTo("buzz"));
    }

    @Test
    public void fizzBuzz() {
        assertThat(FizzBuzz.fizzBuzz(15), equalTo("fizz buzz"));
    }

    @Test
    public void fizzBuzz2(){
        assertThat(FizzBuzz.fizzBuzz(53), equalTo("fizz buzz"));
    }

    @Test
    public void deluxe_fizz(){
        assertThat(FizzBuzz.fizzBuzz(33), equalTo("fizz fake deluxe"));
    }

    @Test
    public void deluxe_buzz(){
        assertThat(FizzBuzz.fizzBuzz(55), equalTo("buzz fake deluxe"));
    }

    @Test
    public void deluxe_only(){
        assertThat(FizzBuzz.fizzBuzz(11), equalTo("fake deluxe"));
    }

    @Test
    public void deluxe_odd(){
        assertThat(FizzBuzz.fizzBuzz(22), equalTo("deluxe"));
    }

    @Test
    public void deluxe_odd_fizz(){
        assertThat(FizzBuzz.fizzBuzz(66), equalTo("fizz deluxe"));
    }
}
