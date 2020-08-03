package refresher.java;

import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Please enter your birth year: ");
        boolean hasNextInt = sc.hasNextInt();
        if (hasNextInt) {
            int yearOfBirth = sc.nextInt();
            sc.nextLine();

            int age = 2020 - yearOfBirth;

            if (age >= 0 && age <= 100) {
                System.out.println("Hello " + name + ", you were born in the year " + yearOfBirth + " and your age is: " + age);
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Unable to parse year of birth.");
        }
        sc.close();
    }
}
