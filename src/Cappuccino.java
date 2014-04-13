/**
 * Created by twer on 4/8/14.
 */
public class Cappuccino extends Drink {

    public Cappuccino() {
        super();
        drinks = new IPrice[]{new Espresso(), new SteamMilk(), new SteamMilk()};
        name = "Cafe Latte";
    }
}
