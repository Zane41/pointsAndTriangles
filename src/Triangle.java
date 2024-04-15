public class Triangle {
    private Point pointA, pointB, pointC;

    public Triangle(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }
    public double calcPerim (Triangle a){
        double p = Point.dlinaOtrezka(a.pointA, pointB)+
                Point.dlinaOtrezka(a.pointB, a.pointC)+
                 Point.dlinaOtrezka(a.pointC, a.pointA);
        return p;
    }
}
