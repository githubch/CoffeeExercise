import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class WaterTest {
    @Test
    public void shouldPriceOfWaterIsZero() throws Exception {
        IPrice water = new Water();
        assertEquals(0.0, water.getPrice());
    }
}
