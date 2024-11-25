package com.programmers.month11;

import java.util.Arrays;
import java.util.List;

public class study_11_25 {
    // 스트림 사용
    public static void main(String[] args) {
        // v1
        List<Integer> list1 = Arrays
                .stream(new int[]{10, 20, 30})
                .mapToObj(e -> e) // int => Integer. 값을 바꾸면서 타입로 레퍼런스로 바꿀 수 있음.
                .toList();

        // v2
        List<Integer> list2 = Arrays
                .stream(new int[]{10, 20, 30})
                .boxed() // int => Integer. 타입만 레퍼런스로 바꿀 수 있음. mapToObj의 제한된 형태
                .toList();

        // v3 : 이 경우는 래핑(boxing)할 필요가 없다.
        List<Integer> list3 = Arrays
                .stream(new Integer[]{10, 20, 30}) //이미 형태가 Integer레퍼런스타입이라서 mapToObj필요 없음.
                .toList();
    }
    //레퍼런스 타입에서 int타입으로 매핑할 때 : mapToInt 이런식으로 사용 가능
}