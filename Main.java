import geometry.Circle;
import geometry.Point;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(new Point(7, 2), 6);

        System.out.println("Środek koła: (" + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ")");
        System.out.println("Promień koła: " + circle.getRadius());
        System.out.println("Obwód koła: " + circle.calculatePerimeter());
        System.out.println("Pole powierzchni koła: " + circle.getArea());
    }
}
