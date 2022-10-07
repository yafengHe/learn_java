package homework;

public class Circle {
    double r;

    public Circle(double r) {
        this.r = r;
    }

    public double circleRound() {
        return 2*3.14*r;
    }

    public double area(double r) {
        this.r = r;
        return r*r*3.14;
    }
}

class PassObject{
    public void printAreas(Circle c, int times) {
        System.out.println("Radius\tArea");
        for (int i = 0; i < times; i++) {
            System.out.println((i+1) + "\t" + c.area(i+1));
        }
    }
}
