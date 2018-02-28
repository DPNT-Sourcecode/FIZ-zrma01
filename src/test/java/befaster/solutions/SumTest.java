package befaster.solutions;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SumTest {

    @Test
    public void compute_sum() {
        assertThat(Sum.sum(1, 1), equalTo(2));
    }

    @Test
    public void compute_sum_large() {
        assertThat(Sum.sum(100, 100), equalTo(200));
    }

    @Test
    public void compute_sum_zero() {
        assertThat(Sum.sum(0, 0), equalTo(0));
    }
}