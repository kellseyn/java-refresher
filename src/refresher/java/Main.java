package refresher.java;

public class Main {

    public static void main(String[] args) {
        //Car.java exercise
//        Car porsche = new Car();
//        Car holden = new Car();
//        porsche.setModel("Carrera");
//        holden.setModel("Commodore");
//        System.out.println("Porsche model: " + porsche.getModel());
//        System.out.println("Holden model: " + holden.getModel());

        BankAccount myAcct = new BankAccount();
        myAcct.setBalance(500.00);
        System.out.println(myAcct.getBalance());
        myAcct.depositFunds(75.75);
        System.out.println(myAcct.getBalance());
        myAcct.withdrawFunds(900.00);
        System.out.println(myAcct.getBalance());
        myAcct.withdrawFunds(400.00);
        System.out.println(myAcct.getBalance());



    }
}
