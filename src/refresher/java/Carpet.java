package refresher.java;

public class Carpet {
    private double cost;

    public Carpet(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        if(cost < 0 ){
            this.cost = 0;
        } else {
            this.cost = cost;
        }
        return cost;
    }

}
