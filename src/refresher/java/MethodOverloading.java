package refresher.java;

public class MethodOverloading {
    public static void main(String[] args) {
        int newScore = calculateScore("Kells", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        System.out.println(calcFeetAndInchesToCentimeters(24));
        System.out.println(calcFeetAndInchesToCentimeters(2, 0));
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored "+ score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("No name, no score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if ((feet >= 0) || ((inches >= 0) || (inches <= 12))){
            double centimeters = (feet * 12) * 2.54;
            return  centimeters;

        } else {
            return -1;
        }

    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches >= 0){
            double feet = inches / 12;
            double remainInches = inches % 12;

            return calcFeetAndInchesToCentimeters(feet, remainInches);
        } else {
            return -1;
        }

    }
}
