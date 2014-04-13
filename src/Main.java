public class Main {
    public static void main(String[] args) {

        Drink[] drinks = new Drink[]{
                new Mocha(),
                new Americano(),
                new CafeLatte(),
                new Cappuccino(),
                new Cortado()
        };

        for(Drink drink : drinks)
            drink.print();
    }
}
