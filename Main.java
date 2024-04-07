
import geometry.Point;
import geometry.ColoredCircle;

public class Main {
    public static void main(String[] args) {
        ColoredCircle circle = new ColoredCircle(new Point(2,5),4,"Czarny" );

        System.out.println("Środek koła: (" + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ")");
        System.out.println("Promień koła: " + circle.getRadius());
        System.out.println("Obwód koła: " + circle.calculatePerimeter());
        System.out.println("Pole powierzchni koła: " + circle.getArea());
        System.out.println("Kolor koła: " + circle.getColor());
    }
}
