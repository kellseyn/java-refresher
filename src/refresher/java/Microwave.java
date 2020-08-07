package refresher.java;

public class Microwave {
    private double cookingTime;
    private int wattage;

    public Microwave(double cookingTime, int wattage) {
        this.cookingTime = cookingTime;
        this.wattage = wattage;
    }

    public void cook(){
        System.out.println("Microwave -> cooking");
    }

    public double getCookingTime() {
        return cookingTime;
    }

    public int getWattage() {
        return wattage;
    }
}
