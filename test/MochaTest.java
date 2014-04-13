import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by twer on 4/8/14.
 */
public class MochaTest {
    @Test
    public void shouldPriceOfMochaIs() throws Exception {
        Mocha mocha = new Mocha();
        assertEquals(2.1, mocha.getPrice());
    }
}
