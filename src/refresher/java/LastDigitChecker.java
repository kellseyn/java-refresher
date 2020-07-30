package refresher.java;

public class LastDigitChecker {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41,22,71));
    }
    public static boolean hasSameLastDigit(int x, int y, int z){
        if (!isValid(x) || !isValid(y) || !isValid(z)) {
            return false;
        } else {
            int xMod = x % 10;
            int yMod = y % 10;
            int zMod = z % 10;
            if (xMod == yMod || xMod == zMod || yMod == zMod){
                return true;
            } else {
                return false;
            }
        }

    }

    public static boolean isValid(int num){
        if (num > 9 && num < 1001){
            return true;
        } else{
            return false;
        }
    }
}
