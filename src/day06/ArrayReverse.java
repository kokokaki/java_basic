package day06;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[7];

        //7번 입력받아 배열의 값을 초기화
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] : ", i);
            arr[i] = sc.nextInt();
        }
        System.out.println("입력받은 배열: " + Arrays.toString(arr));

        int size = arr.length;

        for (int i = 0; i < size / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[size - 1 - i];
            arr[size - 1 - i] = temp;
        }

        System.out.println("역정렬후 배열: " + Arrays.toString(arr));
        sc.close();
    }
}
