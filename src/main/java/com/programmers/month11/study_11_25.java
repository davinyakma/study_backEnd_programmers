package com.programmers.month11;

import java.util.Arrays;

public class study_11_25 {
    // 스트림 사용
    public static void main(String[] args) {
        // 일반
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }

        System.out.println(Arrays.toString(arr));

        // 스트림 . 스트림 배열은 기존 원본배열을 수정하지 못하고 새 배열에 매핑된 결과가 저장된다.
        arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] resultArr = Arrays.stream(arr)
                .map(e -> {
                    return e * 2;
                })
                .toArray();

        resultArr = Arrays.stream(arr)
                .map(e -> e * 2) // 이런식으로 줄여쓸 수 있다.
                .toArray();

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(resultArr));
    }
}