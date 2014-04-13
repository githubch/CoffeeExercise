import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by twer on 4/8/14.
 */
public class CappuccinoTest {
    @Test
    public void shouldPriceOfCappuccinoIs() throws Exception {
        Cappuccino cappuccino = new Cappuccino();
        assertEquals(1, Double.compare(cappuccino.getPrice(), 1.7));
    }
}
