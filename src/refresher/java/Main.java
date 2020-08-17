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

        //Bank account exercise
//        BankAccount myAcct = new BankAccount(123456789, 500.00, "Kells Neagley", "kells@email.com", 2102102102);
//        System.out.println(myAcct.getBalance());
//        myAcct.depositFunds(75.75);
//        System.out.println(myAcct.getBalance());
//        myAcct.withdrawFunds(900.00);
//        System.out.println(myAcct.getBalance());
//        myAcct.withdrawFunds(400.00);
//        System.out.println(myAcct.getBalance());

        //Building dynamic array lesson
        Array numbs = new Array(3);
        numbs.print();
        numbs.insert(10);
        numbs.insert(20);
        numbs.insert(30);
        numbs.insert(40);
        numbs.print();
        numbs.removeAt(3);
        numbs.print();
        System.out.println(numbs.indexOf(10));


    }
}
