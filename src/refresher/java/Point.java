package refresher.java;

public class Point {
    private int x;
    private int y;

    public Point (){

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        int xNull = 0;
        int yNull = 0;

        double distance = Math.sqrt(((xNull = this.x) * (xNull - this.x)) + ((yNull - this.y) * (yNull - this.y)));
        return distance;
    }
    public double distance(int x, int y){


        double distance = Math.sqrt(((x = this.x) * (x - this.x)) + ((y - this.y) * (y - this.y)));
        return distance;
    }
    public double distance(Point another){


        double distance = Math.sqrt(((another.x = this.x) * (another.x - this.x)) + ((another.y - this.y) * (another.y - this.y)));
        return distance;
    }
}
