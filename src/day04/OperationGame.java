package day04;

import java.util.Random;
import java.util.Scanner;

public class OperationGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.println("~~~~~~~~ 재미있는 사칙연산 게임 ~~~~~~~~");
        System.out.println("[즐겁게 문제를 푸시다가 지겨우면 0을 누르세요~]");

        System.out.println("# 엔터를 누르면 시작합니다.");
        System.out.println("=====================================");
        sc.nextLine();

        int qNum = 1; // 문제 일련번호
        int correct = 0, wrong = 0; //정답, 오답 횟수 저장

        int max = 20; //문제 출제 난이도관련변수 (출제 최대값)

        System.out.println("\n# 난이도를 입력하세요.");
        System.out.println("[ 1. 상 (1~100) | 2. 중 (1~50) | 3. 하 (1~20) ]");
        System.out.printf(">> ");
        int level = sc.nextInt();

        if (level == 1) {
            max = 100;
        } else if (level == 2) {
            max = 50;
        } else if (level == 3) {
            max = 20;
        } else {
            max = 999;
        }

        while (true) {
            int first = r.nextInt(max) + 1;
            int second = r.nextInt(max) + 1;

            int markNum = r.nextInt(3); // 랜덤 부호를 위한 3개의 정수중 하나

            int realAnswer = first + second; //실제 정답

            String mark = null; //랜덤 부호를 저장할 변수
            switch (markNum) {
                case 0:
                    mark = "+";
                    realAnswer = first + second;
                    break;
                case 1:
                    mark = "-";
                    if (first < second) {
                        int temp = first;
                        first = second;
                        second = temp;
                    }
                    realAnswer = first - second;
                    break;
                case 2:
                    mark = "x";
                    realAnswer = first * second;
                    break;
            }

            System.out.printf("\nQ%d. %d %s %d = ??\n", qNum++, first, mark, second);
            System.out.printf(">> ");
            int userAnswer = sc.nextInt(); //사용자의 입력답

            //종료 조건
            if (markNum != 1 && userAnswer == 0) break;

            //정답 검증
            if (userAnswer == realAnswer) {
                System.out.println("정답입니다!");
                correct++;
            } else {
                System.out.println("틀렸습니다!");
                wrong++;
            }
        }// end while

        //======== 게임 종료 시점 ===========//
        System.out.println("===============================");
        System.out.printf("# 정답 횟수: %d회, 틀린 횟수: %d회\n", correct, wrong);

        sc.close();

    } //end main
}//end class
