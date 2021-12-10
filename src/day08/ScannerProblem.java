package day08;

import java.util.Scanner;

public class ScannerProblem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("정수: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.printf("문자: ");
        String s = sc.nextLine();

        System.out.println("s = " + s);
        sc.close();
    }
}
