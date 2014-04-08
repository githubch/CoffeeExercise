import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by twer on 4/8/14.
 */
public class CortadoTest {
    @Test
    public void shouldPriceOfCortadoIs() throws Exception {
        IPrice [] drinks = new IPrice[]{new Espresso(), new Espresso(), new SteamMilk()};
        Cortado cortado = new Cortado(drinks);
        assertEquals(1.6, cortado.getPrice());

    }
}
