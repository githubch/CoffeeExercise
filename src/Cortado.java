/**
 * Created by twer on 4/8/14.
 */
public class Cortado extends Drink{
    public Cortado() {
        super();
        drinks = new IPrice[]{new Espresso(), new Espresso(), new SteamMilk()};
        name = "Cortado";
    }
}
