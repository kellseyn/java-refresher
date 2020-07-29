package refresher.java;

public class ForLoops {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++){
            System.out.println(i);
        }

        for (double i = 2; i < 9; i++){
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }
    }
    public static double calculateInterest (double amount, double interest){
        return (amount * (interest/100));
    }
}
