package refresher.java;

public class Refrigerator {
    private boolean containsFood;
    private int temperature;

    public Refrigerator(boolean containsFood, int temperature) {
        this.containsFood = containsFood;
        this.temperature = temperature;
    }

    public boolean isContainsFood() {
        return containsFood;
    }

    public int getTemperature() {
        return temperature;
    }
}
