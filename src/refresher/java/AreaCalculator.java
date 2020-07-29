package refresher.java;

public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(AreaCalculator(5));
    }

    public static double AreaCalculator(double radius) {
        if (radius < 0) {
            return -1;
        } else {

            double squared = radius * radius;
            double area = Math.PI * squared;
            return area;
        }
    }

    public static double AreaCalculator(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        } else {
            return x * y;
        }
    }


}
