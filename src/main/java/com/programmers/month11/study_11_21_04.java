package com.programmers.month11;

public class study_11_21_04 {
    public static void main(String[] args) {
        사람2 a사람1 = new 사람2();
        사람2 a사람2 = new 사람2("홍길순", 55);
    }
}

class 사람2 {
    String 이름;
    int 나이;

    사람2() {
        this.이름 = "홍길동";
        this.나이 = 22;
    }

    사람2(String 이름, int 나이) { //오버로딩! 같은 이름의 메서드인데 매개변수가 다르면 오버로딩
        this.이름 = 이름; //this를 여기서 생략하면 안 되는 이유는 매개변수 이름(지역 변수)와 클래스의 필드 이름(멤버 변수)가 동일하기 때문임.
        //this를 사용하지 않으면, 지역 변수(매개변수)가 우선적으로 참조되어 의도한 클래스의 멤버 변수를 초기화할 수 없다
        this.나이 = 나이; //매개변수와 클래스 멤버 변수 이름이 다르면 this생략 가능함
    }
}
