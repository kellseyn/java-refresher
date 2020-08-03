package refresher.java;

import java.util.Scanner;

public class MinMaxInputChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean first = true;

        while(true) {
            System.out.println("Enter number: ");
            boolean isAnInt = sc.hasNextInt();
            if (isAnInt) {
                int num = sc.nextInt();

                if (first){
                    first = false;
                    min = num;
                    max = num;
                }

                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }

                System.out.println("Max: " + max + " Min: " + min);
                sc.nextLine();
            } else {
                break;
            }
        }
        sc.close();
    }
}
