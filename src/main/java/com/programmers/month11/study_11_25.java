package com.programmers.month11;

import java.util.stream.IntStream;

public class study_11_25 {
    // 스트림 사용
    public static void main(String[] args) {
        //일반
        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //스트림
        IntStream.rangeClosed(1, 10) //1~ 10까지의 물고기들
                .forEach(value -> { //.collect함수 중의 forEach (끝내는 함수)
                    System.out.println(value);
                });
        //스트림
        IntStream.rangeClosed(1, 10)
                .forEach(value -> System.out.println(value)); //좀 더 람다식으로 바꾸려면 ctrl + 1

        // 스트림
        IntStream.rangeClosed(1, 10)
                .forEach(System.out::println);

    }//ctrl + 1로 더 쉬운 코드로 변경해준다.
}
