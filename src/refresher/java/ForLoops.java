package refresher.java;

public class ForLoops {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++){
            System.out.println(i);
        }

        for (double i = 2; i < 9; i++){
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }
        countPrimes();
    }
    public static double calculateInterest (double amount, double interest){
        return (amount * (interest/100));
    }

    public static boolean isPrime(int n){
        if (n == 1){
            return false;
        }
        for (int i = 2; i <= n/2; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void countPrimes(){
        int n = 0;
        for (int i =1; i <= 100; i++){
            if (isPrime(i)){
                System.out.println("Prime number: " + i);
                System.out.println("Prime number count: " + ++n);
                if (n >= 10){
                    break;
                }
            }
        }
    }
}
