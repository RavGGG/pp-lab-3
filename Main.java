import geometry.Circle;
import geometry.ColoredCircle;
import geometry.Point;

public class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[]{
            new Circle(new Point(1, 2), 3.0),
            new Circle(new Point(5, 6), 7.0)
        };

        ColoredCircle[] coloredCircles = new ColoredCircle[]{
            new ColoredCircle(new Point(3, 4), 5.0, "czerwony"),
            new ColoredCircle(new Point(7, 8), 9.0, "zielony")
        };

        for (Circle circle : circles) {
            System.out.println("Powierzchnia koła: " + circle.getArea());
        }

        for (ColoredCircle coloredCircle : coloredCircles) {
            System.out.println("Powierzchnia koła: " + coloredCircle.getArea());
            System.out.println("Kolor koła: " + coloredCircle.getColor());
        }
    }
}