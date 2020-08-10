package refresher.java;

public class DeluxeHamburger extends Hamburger{

    public DeluxeHamburger(String name, String breadType, String meat, double price) {
        super("Deluxe", "White", "Beef", 14.54);
        super.addHamburgerAddonCheese("Chips", 2.75);
        super.addHamburgerAddonTomato("Drink", 1.81);
    }
}
