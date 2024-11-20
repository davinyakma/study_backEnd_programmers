package com.programmers.month11;

public class study_11_20_06 {
    public static void main(String[] args) {
        //예제 1
        // a사람 이라는 변수는 오직 사람하고만 연결될 수 있다.
        사람1 a사람;
        a사람 = new 사람1();
        // 자바가 홍길동을 사람이라고 판단하면 아래 코드는 가능하다.
        a사람 = new 홍길동();

        //예제 2 : 상속을 통한 캐스팅 허용
        무기1 a무기 = new 칼1();

        //예제 3
        칼2 a칼 = new 칼2();
        a칼 = new 활1();
    }
}

//예제 1
class 사람1 { }
class 홍길동 extends 사람1 { } // 이렇게 하면 자바에 홍길동이 사람이라고 판단

//예제 2
class 무기1 { }
class 칼1 extends 무기1 { }

//예제 3
class 칼2 { }
class 활1 extends 칼2 { }