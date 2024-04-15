import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
       // calcAverPerimTask2(task1());
        calcSumSquare(task3(new File(("INPUT.txt"))));

    }


    public static ArrayList<Triangle> task1() {
        System.out.println("Введи координаты 6 точек");
        Scanner vvod = new Scanner(System.in);
        ArrayList<Triangle> returnList = new ArrayList<>();
        Point a, b, c;
        while (vvod.hasNext()) {
            a = new Point(vvod.nextDouble(), vvod.nextDouble());
            b = new Point(vvod.nextDouble(), vvod.nextDouble());
            c = new Point(vvod.nextDouble(), vvod.nextDouble());
            if (Point.dlinaOtrezka(a, b) < Point.dlinaOtrezka(b, c) + Point.dlinaOtrezka(c, a) &&
                    Point.dlinaOtrezka(b, c) < Point.dlinaOtrezka(c, a) + Point.dlinaOtrezka(a, b) &&
                    Point.dlinaOtrezka(c, a) < Point.dlinaOtrezka(a, b) + Point.dlinaOtrezka(b, c))
                returnList.add(new Triangle(a, b, c));
            else System.out.println("Такого треугольника не существует, введи другик координаты!");
        }
            return returnList;
    }
    public static double calcAverPerimTask2 (ArrayList<Triangle> list){
        double per = 0;
        for(Triangle x:list)
          per += x.calcPerim(x) ;
        per= per/list.size();
        System.out.println("Средний периметр треугольников равен: "+per);
        return per;
    }
    public static ArrayList<Triangle> task3 (File file) throws FileNotFoundException {
        Scanner vvod = new Scanner(file);
        ArrayList<Triangle> returnList = new ArrayList<>();
        while (vvod.hasNextLine()) {
            returnList.add(new Triangle(new Point(vvod.nextDouble(), vvod.nextDouble()),
                    new Point(vvod.nextDouble(), vvod.nextDouble()),
                    new Point(vvod.nextDouble(), vvod.nextDouble())));
        }
            vvod.close();
        return returnList;
    }
    public static void calcSumSquare (ArrayList<Triangle> list){
        double sumSq = 0;
        for (Triangle x:list)
            sumSq+=Math.sqrt(x.calcPerim(x)*(x.calcPerim(x)-Point.dlinaOtrezka(x.getPointA(),x.getPointB()))*
                    (x.calcPerim(x)-Point.dlinaOtrezka(x.getPointB(),x.getPointC()))*
                    (x.calcPerim(x)-Point.dlinaOtrezka(x.getPointC(),x.getPointA())));
        System.out.println("Суммарная площадь треугольников равна: "+sumSq);
    }
}
