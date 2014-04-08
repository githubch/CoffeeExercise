import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by twer on 4/8/14.
 */
public class CappuccinoTest {
    @Test
    public void shouldPriceOfCappuccinoIs() throws Exception {
        IPrice [] drinks = new IPrice[]{new Espresso(), new SteamMilk(), new SteamMilk()};
        Cappuccino cappuccino = new Cappuccino(drinks);
        assertEquals(1, Double.compare(cappuccino.getPrice(), 1.7));
    }
}
