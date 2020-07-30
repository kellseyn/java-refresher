package refresher.java;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15,55));
    }
    public static boolean hasSharedDigit(int x, int y){
        if (x < 10 || x > 99 || y < 10 || y > 99){
            return false;
        } else{
            int singleX = x % 10;
            int tenX = x / 10;
            int singleY = y % 10;
            int tenY = y / 10;

            if (singleX == singleY || singleX == tenY || tenX == singleY || tenX == tenY ){
                return true;
            } else {
                return false;
            }
        }
    }
}
