/**
 * Created by twer on 4/8/14.
 */
public class CafeLatte extends Drink{

    public CafeLatte() {
        super();
        drinks = new IPrice[]{new SteamMilk(), new SteamMilk(), new Espresso(), new WhipCream()};
        name = "Cafe Latte";
    }
}
