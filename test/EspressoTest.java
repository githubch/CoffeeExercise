import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by twer on 4/8/14.
 */
public class EspressoTest {
    @Test
    public void shouldPriceOfEspressoIsDot5Dollar() throws Exception {
        Espresso espresso = new Espresso();
        assertEquals(0.5, espresso.getPrice());
    }
}
