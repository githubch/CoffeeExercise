/**
 * Created by twer on 4/8/14.
 */
public class Americano {
    private double price;
    private IPrice[] drinks;

    public Americano(IPrice[] drinks) {

        this.drinks = drinks;
    }

    public double getPrice() {
        price = 0.0;
        for(IPrice item : drinks)
            price += item.getPrice();
        return price;
    }
}
