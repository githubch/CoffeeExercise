import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by twer on 4/8/14.
 */
public class AmericanoTest {
    @Test
    public void shouldPriceOfAmericanoIs() throws Exception {
        IPrice [] drinks = new IPrice[]{new Espresso(), new Water()};
        Americano americano = new Americano(drinks);
        assertEquals(0.5, americano.getPrice());
    }
}
