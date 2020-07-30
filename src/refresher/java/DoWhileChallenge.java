package refresher.java;

public class DoWhileChallenge {
    public static void main(String[] args) {
        System.out.println(isEvenNumber(4));
        System.out.println(isEvenNumber(7));
        System.out.println(isEvenNumber(-2));

        int number = 4;
        int finishedNum = 20;
        int count = 0;

        do {

            number++;
            if (!isEvenNumber(number)){
                continue;
            }
            System.out.println("Even number " + number);
            count++;
            if (count >= 5) {
                break;
            }

        } while(number <= finishedNum);
        System.out.println(count);


    }
    public static boolean isEvenNumber(int num){

        if ((num % 2) == 0){
            return true;
        } else {
            return false;
        }

    }
}
