package day19.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListPushQuiz {

    public static void main(String[] args) {


        System.out.println("# 먹고 싶은 음식을 입력하세요!!");
        System.out.println("# 입력을 중지하려면 <그만>이라고 입력하세요.");

        Scanner sc = new Scanner(System.in);

        //String[] foodList = {}; //음식명들을 저장할 배열
        List<String> foodList = new ArrayList<>();

        while (true) {
            System.out.printf(">> ");
            String newFood = sc.nextLine();

            if (newFood.equals("그만")) break;

            foodList.add(newFood);

        }// end while

        System.out.println("먹고 싶은 음식리스트: " + foodList);
        sc.close();

    }//end main
}//end class
