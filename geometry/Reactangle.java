package geometry;

public class Reactangle {
    private double length;
    private double width;

     public Reactangle(double length, double width) {
        this.length = length;
        this.width= width;

     }

     public double calculateArea(){
        return length * width;
     }

     public double calculatePerimeter(){
        return 2 * length + 2 * width;
     }


}
