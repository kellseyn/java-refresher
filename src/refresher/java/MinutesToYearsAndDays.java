package refresher.java;

public class MinutesToYearsAndDays {
    public static void main(String[] args) {
        MinutesToYearsAndDaysCalculator(530000);
    }
    public static void MinutesToYearsAndDaysCalculator(long minutes){
        if (minutes < 0){
            System.out.println("Invalid Value");
        } else {
            long hours = minutes / 60;
            long remainMinutes = minutes % 60;
            long days = hours / 24;
            long remainHours = hours % 24;
            long years = days / 365;
            long remainDays = days % 365;

            System.out.println(minutes + " min = " + years + " y and " + remainDays + " d");
        }
    }
}
