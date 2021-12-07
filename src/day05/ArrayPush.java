package day05;

import java.util.Arrays;

public class ArrayPush {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30};

        //배열 데이터 추가 알고리즘
        int newData = 40; //새롭게 추가할 데이터

        //1. 원본배열보다 사이즈가 1개 더 큰 새로운 배열 생성
        int[] temp = new int[arr.length + 1];

        //2. 원본배열에 있던 기존데이터를 전부 복사해서 새로운 배열로 이동
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        //3. 신규데이터를 마지막인덱스에 추가
        temp[temp.length - 1] = newData;

        //4. 주소값 이전
        arr = temp;
        temp = null;

        System.out.println(Arrays.toString(arr));

    }
}
