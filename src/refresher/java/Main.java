package refresher.java;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("Carrera");
        holden.setModel("Commodore");
        System.out.println("Porsche model: " + porsche.getModel());
        System.out.println("Holden model: " + holden.getModel());

    }
}
