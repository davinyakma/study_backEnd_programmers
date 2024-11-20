package com.programmers.month11;

public class study_11_20_04 {
    public static void main(String[] args) {
        사람 a사람 = new 사람();
        a사람.숨쉬다(); // 출력 : 숨쉬다.
    }
}

//기존에 main함수와 동물 클래스만 주어졌을 때는 사람 클래스의 객체를
//만들 수 없어서 오류 났음. 그래서 동물 클래스의 '숨쉬다'메소드를
//상속 받으면 부모의 메소드를 자식 클래스의 객체가 사용할 수 있다.
class 사람 extends 동물 {

}
class 동물 {
    void 숨쉬다() {
        System.out.println("숨쉬다.");
    }
}
