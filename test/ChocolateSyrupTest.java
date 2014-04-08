import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by twer on 4/8/14.
 */
public class ChocolateSyrupTest {
    @Test
    public void shouldPriceOfChocolateSyrupIsDot2() throws Exception {
        ChocolateSyrup chocolateSyrup = new ChocolateSyrup();
        assertEquals(0.2, chocolateSyrup.getPrice());
    }
}
