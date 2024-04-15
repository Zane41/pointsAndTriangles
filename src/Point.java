public class Point {
   private double x,y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public static  double dlinaOtrezka (Point a, Point b){
        double d=Math.sqrt(Math.pow(b.x-a.x,2)+Math.pow(b.y-a.y,2)); return d;
    }
}
