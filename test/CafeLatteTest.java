import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by twer on 4/8/14.
 */
public class CafeLatteTest {
    @Test
    public void shouldPriceOfCafeLatteIs2Dot5() throws Exception {
        IPrice [] drinks = new IPrice[]{new SteamMilk(), new SteamMilk(), new Espresso(), new WhipCream()};
        CafeLatte cafeLatte = new CafeLatte(drinks);
        assertEquals(2.5, cafeLatte.getPrice());
    }
}
