package com.programmers.month11;

import java.util.stream.IntStream;

public class study_11_25 {
    // 스트림 사용
    public static void main(String[] args) {
        //일반
        for(int i = 1; i <= 10; i++) {
            if( i % 2 == 0) continue; //뒤의 코드를 지나치고 다음 단계로 넘어감. 짝수는 제외하고 출력하기 위한 코드
            System.out.println(i);
        }

        // 스트림, 인텔리제이에서 브레이크 포인트 걸어서 Trace Current Stream Chain 뷰를 확인해보세요.
        IntStream.rangeClosed(1, 10) //1~ 10까지의 물고기들
                .filter(value -> value % 2 != 0) //10번 필터 실행됨. 하나하나 바로 필터에서 forEach로 넘어감.
                .forEach(value -> { //.collect함수 중의 forEach (끝내는 함수)
                    System.out.println(value);
                });
    }//ctrl + 1로 더 쉬운 코드로 변경해준다.
    //stream은 true, false만 리턴하는 경우에만 사용한다. .filter에도 true, false만 리턴되는 조건을 넣어야 함.
}
