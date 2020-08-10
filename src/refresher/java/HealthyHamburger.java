package refresher.java;

public class HealthyHamburger extends Hamburger{
    private String avocado;
    private double avocadoPrice;
    private String egg;
    private double eggPrice;

    public HealthyHamburger(String meat, double price) {
        super("Healthy", "Brown Rye", meat, price);
    }

    public void addHealthyAddonAvocado(String name, double price){
        this.avocado = name;
        this.avocadoPrice = price;
    }

    public void addHealthyAddonEgg(String name, double price){
        this.egg = name;
        this.eggPrice = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if (this.avocado != null){
            hamburgerPrice += this.avocadoPrice;
            System.out.println("Added " + this.avocado + " for and extra " + this.avocadoPrice);
        }
        if (this.egg != null){
            hamburgerPrice += this.eggPrice;
            System.out.println("Added " + this.egg + " for and extra " + this.eggPrice);
        }
        return hamburgerPrice;

    }
}
