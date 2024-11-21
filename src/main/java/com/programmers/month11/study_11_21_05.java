package com.programmers.month11;

public class study_11_21_05 {
    public static void main(String[] args) {
        전사 a전사 = new 전사();
        a전사.이름 = "카니";
        a전사.나이 = 122;
        a전사.a무기 = new 칼();
        a전사.공격();
        // 출력 : 22살 전사 카니(이)가 칼(으)로 공격합니다.

        a전사.이름 = "초코";
        a전사.나이 = 123;
        a전사.a무기 = new 활();
        a전사.공격();
        // 출력 : 22살 전사 초코(이)가 활(으)로 공격합니다.
    }
}

class 전사 {
    String 이름;
    int 나이;
    무기 a무기;

    void 공격() {
        a무기.작동(이름, 나이);
    }
}

//작동 메소드가 중복이 된다. 이름, 나이, 무기명만 다르고 출력문을 다 호출한다.
abstract class 무기 {
    String 무기명;
    void 작동(String 사용자_이름, int 사용자_나이) {
        System.out.println(사용자_나이 + "살 전사 " + 사용자_이름 + "(이)가" +무기명 +"(으)로 공격합니다.");
    }
}

class 칼 extends 무기 { //무기명이 칼
    //상속을 받으면 '무기' 클래스의 변수, 메소드를 포함한 것과 같다.
    //따라서 '칼'클래스와 이름이 같은 '칼'생성자에 '무기명'변수가 없더라도 '무기'클래스의 '무기명'을
    //사용할 수 있기때문에 빈 생성자를 만들어 무기명을 선언해주면 된다.
    /*String 무기명;
    void 작동(String 사용자_이름, int 사용자_나이) {
        System.out.println(사용자_나이 + "살 전사 " + 사용자_이름 + "(이)가" +무기명 +"(으)로 공격합니다.");
    }*/
    칼() {
        무기명 = "칼";
    }
}

class 활 extends 무기 { //무기명이 활
    활(){
        무기명 = "활";
    }
}

//원래 '작동' 메소드가 중복되는 코드. abstract추상화 코드를 사용해서
//자식 클래스들이 직접 '작동' 메소드를 정의해줘야 했음.
/*
abstract class 무기 {
    abstract void 작동(String 사용자_이름, int 사용자_나이);
}

class 칼 extends 무기 {
    void 작동(String 사용자_이름, int 사용자_나이) {
        System.out.println(사용자_나이 + "살 전사 " + 사용자_이름 + "(이)가 칼(으)로 공격합니다.");
    }
}

class 활 extends 무기 {
    void 작동(String 사용자_이름, int 사용자_나이) {
        System.out.println(사용자_나이 + "살 전사 " + 사용자_이름 + "(이)가 활(으)로 공격합니다.");
    }
}*/
