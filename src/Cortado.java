/**
 * Created by twer on 4/8/14.
 */
public class Cortado {
    private double price;
    private IPrice[] drinks;

    public Cortado(IPrice[] drinks) {

        this.drinks = drinks;
    }

    public double getPrice() {
        price = 0.0;
        for(IPrice item : drinks)
            price += item.getPrice();
        return price;
    }
}
