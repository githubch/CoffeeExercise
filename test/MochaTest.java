import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by twer on 4/8/14.
 */
public class MochaTest {
    @Test
    public void shouldPriceOfMochaIs() throws Exception {
        IPrice [] drinks= new IPrice[]{new SteamMilk(), new Espresso(), new ChocolateSyrup(), new WhipCream()};
        Mocha mocha = new Mocha(drinks);
        assertEquals(2.1, mocha.getPrice());
    }
}
