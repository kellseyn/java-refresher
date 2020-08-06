package refresher.java;

public class Floor {
    private double width;
    private double length;

    public Floor(double width, double length) {
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        if (length < 0){
            length = 0;
        } else  if (width < 0){
            width = 0;
        } else {
            this.width = width;
            this.length = length;
        }
        return width * length;
    }
}
