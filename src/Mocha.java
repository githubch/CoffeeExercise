/**
 * Created by twer on 4/8/14.
 */
public class Mocha extends Drink{
    public Mocha() {
        drinks = new IPrice[]{new SteamMilk(), new Espresso(), new ChocolateSyrup(), new WhipCream()};
        name = "Mocha";
    }
}
