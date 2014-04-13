import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by twer on 4/8/14.
 */
public class CafeLatteTest {
    @Test
    public void shouldPriceOfCafeLatteIs2Dot5() throws Exception {
        CafeLatte cafeLatte = new CafeLatte();
        assertEquals(2.5, cafeLatte.getPrice());
    }
}
