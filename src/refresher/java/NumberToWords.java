package refresher.java;

public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(554);
    }
    public static void numberToWords(int number){
        int numberCount = getDigitCount(number);
        number = reverse(number);
        int reversedNumberCount = getDigitCount(number);
        if (number < 0){
            System.out.println("InvalidValue");
        } else {
            while (number != 0) {
                int lastDigit = number % 10;

                switch (lastDigit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                number = number / 10;
            }
            if (reversedNumberCount < numberCount){
                for (int i = 0; i < numberCount - reversedNumberCount; i++){
                    System.out.println("Zero");
                }
            }

        }
    }

    public static int reverse(int num){
        int reverse = 0;
        int temp = num;

        while (temp != 0){
            int lastDigit = temp % 10;
            temp /= 10;
            reverse *= 10;
            reverse += lastDigit;
        }
        return reverse;
    }

    public static int getDigitCount(int number){
        if (number < 0){
            return -1;
        }

        int temp = number;

        int count = 0;

        do{
            number /= 10;
            count++;
        } while (number != 0);
        return count;
    }
}
