/**
 * Created by twer on 4/10/14.
 */
public abstract class Drink {
    protected IPrice[] drinks;
    protected String name;
    private double price;

    public double getPrice() {
        price = 0.0;
        for(IPrice item : drinks)
            price += item.getPrice();
        return price;
    }

    public void print()
    {
        System.out.println(String.format("%s :%s", name, getPrice()));
    }
}
