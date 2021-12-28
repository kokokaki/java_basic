package day15.poly.overloading;

public class Rectangle {

    //정사각형의 넓이를 구하는 기능
    // calcArea(int)
    public int calcArea(int length) {
        return length * length;
    }

    //calcArea(int)
    //public void calcArea(int a) {}

    //직사각형의 넓이를 구하는 기능
    //calcArea(int, int)  ->   calcArea(10, 20)
    public int calcArea(int width, int height) {
        return width * height;
    }

    //calcArea(int, double)  ->  calcArea(10, 3.5)
    public void calcArea(int x, double y) {}

    //calcArea(double, int)   -> calcArea(5.5, 3)
    public String calcArea(double x, int y) {
        System.out.println();
        return null;
    }
}
