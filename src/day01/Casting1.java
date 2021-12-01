package day01;

public class Casting1 {

    public static void main(String[] args) {

        // 암시적 형변환 (upcating, promotion)
        byte a = 100;  //  1바이트

        int b = a;

        double c = b;
        System.out.println("c = " + c);
    }
}
