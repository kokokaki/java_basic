package day18.api.lang.wrapper;

import day15.poly.car.Sonata;

public class Wrapper {

    public static void main(String[] args) {

        // Byte, Short, Integer, Long, Float, Double, Boolean, Character

        Integer x = 7;
        int y = 7;

        Object[] oArr = {7, 10, 5.5, "메롱", new Sonata()};

        //문자열 -> 기본타입 변환
        String s1 = "90";
        String s2 = "5.11";

        int i = Integer.parseInt(s1);
        double v = Double.parseDouble(s2);
        System.out.println(i + v);

        //기본타입 -> 문자열 변환
        String m = String.valueOf(i);
        String n = String.valueOf(v);
        System.out.println(m + n);

    }
}
