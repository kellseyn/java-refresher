package refresher.java;

class Ford extends CarPolymorphism{
    public Ford(int cylinders, int wheels, String name) {
        super(cylinders, wheels, name);
    }

    @Override
    public String startEngine() {
        return super.startEngine();
    }

    @Override
    public String accelerate() {
        return super.accelerate();
    }

    @Override
    public String brake() {
        return super.brake();
    }
}

class Cadillac extends CarPolymorphism{

    public Cadillac(int cylinders, int wheels, String name) {
        super(cylinders, wheels, name);
    }

    @Override
    public String startEngine() {
        return super.startEngine();
    }

    @Override
    public String accelerate() {
        return super.accelerate();
    }

    @Override
    public String brake() {
        return super.brake();
    }
}

class Slingshot extends CarPolymorphism{
    public Slingshot(int cylinders, int wheels, String name) {
        super(cylinders, wheels, name);
    }

    @Override
    public String startEngine() {
        return super.startEngine();
    }

    @Override
    public String accelerate() {
        return super.accelerate();
    }

    @Override
    public String brake() {
        return super.brake();
    }
}

public class CarPolymorphism {

    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public CarPolymorphism(int cylinders, int wheels, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = wheels;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String startEngine(){
        return "Starting engine";
    }

    public String accelerate(){
        return "accelerating vehicle";
    }

    public String  brake(){
        return "applied brake";
    }

    public boolean isEngine() {
        return engine;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public static void main(String[] args) {
        Cadillac CTS = new Cadillac( 4, 4, "CTS");
        Slingshot Slingshot = new Slingshot( 6, 3, "Slingshot");
        Ford Mustang = new Ford(8, 4, "Mustang");

    }
}
