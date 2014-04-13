/**
 * Created by twer on 4/8/14.
 */
public class Americano extends Drink{
    public Americano() {
        super();
        drinks = new IPrice[]{new Espresso(), new Water()};
        name = "Americano";
    }
}
