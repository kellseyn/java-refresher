package refresher.java;

public class Operators {
    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("result " + result);
        int previousResult = result;
        System.out.println("previous Result is " + previousResult);
        result = result -1;
        System.out.println("result minus 1 " + result);
        System.out.println("previous Result is " + previousResult);

        result = result *  10;
        System.out.println("result times 10 " + result);

        result = result / 5;
        System.out.println("result divide 5 " + result);

        result = result % 3;
        System.out.println("result mod 3 " + result);

        result++;
        System.out.println("plus op " + result);

        result--;
        System.out.println("minus op " + result);

        result += 2;
        System.out.println("adding 2 plusequal " + result);

        result *= 10;
        System.out.println("times equals by 10 " + result);

        boolean isAlien = false;
        if (isAlien == false){
            System.out.println("Not an alien");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100){
            System.out.println("Second top score");
        }

        if ((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("you got a pretty good score" );
        }

        int newValue = 50;
        if (newValue == 50 ){
            System.out.println("this is true");
        }

        boolean isCar = false;
        if (isCar == true){
            System.out.println("");
        }

        isCar = true;
        boolean wasCar = isCar ? true :false;
        if (wasCar){
            System.out.println("wasCar is true");
        }



    }
}
