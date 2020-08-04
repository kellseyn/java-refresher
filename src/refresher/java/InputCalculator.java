package refresher.java;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int sum = 0;
            long avg = 0;
            int count = 0;

            while (true) {
                System.out.println("Enter number: ");
                boolean isAnInt = sc.hasNextInt();

                if (isAnInt) {
                    count++;
                    int num = sc.nextInt();
                    sum += num;
                    avg = Math.round((double)sum / count);
                    sc.nextLine();
                } else {

                    System.out.println("SUM = " + sum + " AVG = " + avg);
                    break;
                }

            }
            sc.close();
    }

}
