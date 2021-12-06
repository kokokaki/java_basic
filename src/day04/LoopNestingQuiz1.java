package day04;

import java.util.Scanner;

public class LoopNestingQuiz1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("옆으로 긴 직사각형을 그립니다.");
        System.out.printf("한 변(1): ");
        int side1 = sc.nextInt();
        System.out.printf("한 변(2): ");
        int side2 = sc.nextInt();
        sc.close();

        //가로, 세로 길이를 결정
        int width, height;
        if (side1 > side2) {
            width = side1;
            height = side2;
        } else {
            width = side2;
            height = side1;
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.printf("* ");
            }
            System.out.printf("\n");
        }

    }
}
