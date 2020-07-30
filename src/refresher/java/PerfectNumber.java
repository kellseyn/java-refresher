package refresher.java;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }
    public static boolean isPerfectNumber(int number) {
        int bucket = 0;

        if (number < 1){
            return false;
        }

        for (int i = 1; i < number; i++) {
            if (number % i == 0)
                bucket += i;
        }

        if (bucket == number) {
            return true;
        } else {
            return false;
        }


    }

}
