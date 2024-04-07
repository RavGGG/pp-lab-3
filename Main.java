import geometry.Reactangle;

public class Main {
    public static void main(String[] args) {
        Reactangle reactangle = new Reactangle( 10, 5);

        System.out.println("Pole prostokata: " + reactangle.calculateArea());
        System.out.println("Obwód prostokąta: " + reactangle.calculatePerimeter());

    }
}