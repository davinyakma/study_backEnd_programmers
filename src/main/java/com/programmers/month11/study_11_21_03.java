package com.programmers.month11;

//1번 문제: a전사.a무기를 구현하기 위해 전사 클래스에서 무기 a무기를 생성 후 공격 메소드에서 a무기의 동작 메소드를 호출
//2번 문제 : 1번 문제에 매개변수를 전달. 동작 메소드가 이름과 나이를 출력하므로 매개변수를 전달하고
//이는 전사 클래스가 아니라 무기 클래스에서 전달을 해야 함
public class study_11_21_03 {
    public static void main(String[] args) {
        전사 a전사 = new 전사();
        a전사.이름 = "카니";
        a전사.나이 = 22;
        a전사.a무기 = new 칼3();
        a전사.공격();
        a전사.공격2();
        // 1문제 출력 : 전사가 칼로 공격합니다.
        // 2문제 출력 : 22살 전사 카니(이)가 칼(으)로 공격합니다.

        a전사.이름 = "초코";
        a전사.a무기 = new 활2();
        a전사.공격();
        a전사.공격2();
        // 1문제 출력 : 전사가 활로 공격합니다.
        // 2문제 출력 : 22살 전사 초코(이)가 활(으)로 공격합니다.
    }
}

class 전사 {
    String 이름;
    int 나이;
    무기2 a무기; //무기 a무기 = new 무기();

    void 공격() { //이게 정답의 큰 포인트!! 난 이부분 구현 빼먹었음
        a무기.동작();
    }

    void 공격2(){
        a무기.동작2(이름, 나이);
    }
}

abstract class 무기2{
    abstract void 동작(); //abstract void 공격(){
    abstract void 동작2(String 이름, int 나이); //abstract void 공격(){
}

class 칼3 extends 무기2{
    void 동작(){
        System.out.println("전사가 칼로 공격합니다.");
    }
    void 동작2(String 이름, int 나이){
        System.out.println(나이 + "살 전사" + 이름 + "(이)가 칼(으)로 공격합니다.");
    }
}

class 활2 extends 무기2 {
    void 동작(){
        System.out.println("전사가 활로 공격합니다.");
    }
    void 동작2(String 이름, int 나이){
        System.out.println(나이 + "살 전사" + 이름 + "(이)가 활(으)로 공격합니다.");
    }
}