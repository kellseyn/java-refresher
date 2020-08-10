package refresher.java;

public class Hamburger {

    private String name;
    private String breadType;
    private String meat;
    private double price;


    private String lettuce;
    private double lettucePrice;
    private String tomato;
    private double tomatoPrice;
    private String cheese;
    private double cheesePrice;
    private String onion;
    private double onionPrice;

    public Hamburger(String name, String breadType, String meat, double price) {
        this.name = name;
        this.breadType = breadType;
        this.meat = meat;
        this.price = price;
    }

    public void addHamburgerAddonLettuce(String name, double price){
        this.lettuce = name;
        this.lettucePrice = price;
    }

    public void addHamburgerAddonTomato(String name, double price){
        this.tomato = name;
        this.tomatoPrice = price;
    }

    public void addHamburgerAddonCheese(String name, double price){
        this.cheese = name;
        this.cheesePrice = price;
    }

    public void addHamburgerAddonOnion(String name, double price){
        this.onion = name;
        this.onionPrice = price;
    }

    public double itemizeHamburger(){
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger on a " + this.breadType + " roll with " + this.meat + ", price is " + this.price);
        if (this.lettuce != null){
            hamburgerPrice += this.lettucePrice;
            System.out.println("Added " + this.lettuce + " for and extra " + this.lettucePrice);
        }
        if (this.tomato != null){
            hamburgerPrice += this.tomatoPrice;
            System.out.println("Added " + this.tomato + " for and extra " + this.tomatoPrice);
        }
        if (this.cheese != null){
            hamburgerPrice += this.cheesePrice;
            System.out.println("Added " + this.cheese + " for and extra " + this.cheesePrice);
        }
        if (this.onion != null){
            hamburgerPrice += this.onionPrice;
            System.out.println("Added " + this.onion + " for and extra " + this.onionPrice);
        }

        return hamburgerPrice;
    }


    public static void main(String[] args) {

        Hamburger burger = new Hamburger("Basic", "White", "Beef", 4.50);
        double price = burger.itemizeHamburger();



    }
}
