import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }


    public List<Triangle> task1 () {
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
    public double calcAverPerim (ArrayList<Triangle> list){
        double per = 0;
        for(Triangle x:list)
          per += x.calcPerim(x) ;
        per= per/list.size(); return per;
    }
}
