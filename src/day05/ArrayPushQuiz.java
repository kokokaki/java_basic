package day05;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPushQuiz {

    public static void main(String[] args) {
        // 문자열끼리의 동등비교 시 ==을 사용하지 말고
        // 문자열1.equals(문자열2) 를 사용할 것!
        // ex) if (s1 == s2)  (x)
        //     if (s1.equals(s2)) (o)


        //음식명을 처음 1개 입력받고서 해야할 일
        // 1. 입력한 문자가 그만인지 확인해본다.
        // 2. 그만이면 반복문을 종료하고 아니면? 배열에 저장해야한다.
        // 3-1. 음식의 개수가 정해지지 않았으므로 일단은 빈 배열로 시작한다.
        // 4. 음식이 한개 입력되었을 때? 빈배열이므로 음식명을 저장할수 없다.
        // 5. 배열의 크기를 1개 늘려야한다. 그리고 그 자리에 음식명을 저장한다.

        //2번째 음식명 입력부터 해야할 일
        // 3-2. 기존 음식이 저장된 배열보다 1개 더 큰 배열을 생성한다
        // 4. 기존 음식명들을 새로 생성된 배열로 복사한다.
        // 5. 마지막 위치에 지금 입력받은 음식명을 저장한다.


        System.out.println("# 먹고 싶은 음식을 입력하세요!!");
        System.out.println("# 입력을 중지하려면 <그만>이라고 입력하세요.");

        Scanner sc = new Scanner(System.in);

        String[] foodList = {}; //음식명들을 저장할 배열

        while (true) {
            System.out.printf(">> ");
            String newFood = sc.nextLine();

            if (newFood.equals("그만")) break;

            //배열에 신규데이터가 들어갈 공간 확보
            String[] temp = new String[foodList.length + 1];

            //기존 데이터 복사
            for (int i = 0; i < foodList.length; i++) {
                temp[i] = foodList[i];
            }
            //신규데이터 마지막인덱스에 추가
            temp[temp.length - 1] = newFood;
            foodList = temp; temp = null;
        }// end while

        System.out.println("먹고 싶은 음식리스트: " + Arrays.toString(foodList));
        sc.close();

    }//end main
}//end class
