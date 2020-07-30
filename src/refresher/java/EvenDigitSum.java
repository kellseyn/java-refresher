package refresher.java;

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(24688));
    }

    public static int getEvenDigitSum(int number){
        if (number < 0){
            return -1;
        } else {
            int bucket = 0;
            int digit;
            while(number > 0){
                digit = number % 10;
                if (digit % 2 == 0){
                    bucket += digit;
                }
                number = number / 10;
            }
            return bucket;

        }
    }
}
