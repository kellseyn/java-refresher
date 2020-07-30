package refresher.java;


public class NumberPalindrome {

    public static void main(String[]args){
        System.out.println(isPalindrome(123432));
        System.out.println(isPalindrome(1234321));
        System.out.println(isPalindrome(12343211));
    }
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int num = number;

        while(num != 0){
            int last = num % 10;
            reverse = reverse * 10 + last;
            num /= 10;
        }
        return reverse == number;

    }

}
