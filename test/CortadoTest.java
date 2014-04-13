import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by twer on 4/8/14.
 */
public class CortadoTest {
    @Test
    public void shouldPriceOfCortadoIs() throws Exception {
        Cortado cortado = new Cortado();
        assertEquals(1.6, cortado.getPrice());

    }
}
