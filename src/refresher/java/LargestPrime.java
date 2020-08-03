package refresher.java;

public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
    }
    public static int getLargestPrime(int number) {
        int prime = -1;
            for (int i = 2; i <= number; i++) {
                if (number % i == 0) {
                    boolean isPrime = true;
                    for (int j = 2; j < i; j++) {
                        if (i % j == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime) {
                        prime = i;
                    }
                }
            }
            return prime;

    }
}
