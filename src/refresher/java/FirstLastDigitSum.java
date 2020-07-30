package refresher.java;

public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(356));
        System.out.println(sumFirstAndLastDigit(35628));
        System.out.println(sumFirstAndLastDigit(35669));
    }
    public static int sumFirstAndLastDigit(int number){
        if (number < 0) {
            return -1;
        } else{

            int lastDigit = number % 10;
            int firstDigit = number;

            while(firstDigit >= 10){
                firstDigit = number /= 10;
            }
            return firstDigit + lastDigit;
        }
    }
}
