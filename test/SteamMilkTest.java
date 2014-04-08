import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class SteamMilkTest {
    @Test
    public void shouldPriceOfSteamMilkIsDot6() {
        SteamMilk steamMilk = new SteamMilk();
        assertEquals(0.6, steamMilk.getPrice());
    }
}
