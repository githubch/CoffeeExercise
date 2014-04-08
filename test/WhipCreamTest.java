import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by twer on 4/8/14.
 */
public class WhipCreamTest {
    @Test
    public void shouldPriceOfWhipCreamIsDot8() throws Exception {
        WhipCream whipCream = new WhipCream();
        assertEquals(0.8, whipCream.getPrice());
    }
}
