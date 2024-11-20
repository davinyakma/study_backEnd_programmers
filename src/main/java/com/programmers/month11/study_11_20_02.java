package com.programmers.month11;

// 레퍼런스변수에 값 할당하기
public class study_11_20_02 {
    public static void main(String[] args){
        // 오직 Car 리모콘만 저장 할 수 있는 변수 `ACar`를 만든다.
        Car ACar;

        // Car 설계도(클래스)로 Car 객체를 변수 외!부!에 만든다.
        // Car 객체는 자신을 조종할 수 있는 리모콘(this)를 가지고 태어난다. 즉 Car 객체 만들 때 Car 리모콘도 같이 만들어진다.
        // Car 객체는 자신이 들고 있는 리모콘(this)를 복사해서 반환한다.
        // ACar 안에 들어있던 쓰레기 리모콘이 진짜 리모콘으로 대체된다.
        ACar = new Car();

        // `ACar` 변수에 안에 있는 리모콘의 `run` 버튼을 누른다.
        // 해당 신호가 리모콘과 연결되어 있는 Car 객체에 전달되어 `run` 기능이 실행된다.
        ACar.run();
        //'stop' 기능도 같은 방식으로 실행된다.
        ACar.stop();

        // 모든 객체들은 서로를 평생 볼 수 없다.
        // 모든 객체들은 서로를 원격조종한다.
    }
}

// Car 설계도!, 절대 Car가 아니다.!!! Car설계도를 외부에서 객체 생성하여 사용하는 것임.
class Car {
    // 이 메서드(함수)의 2가지 용도
    // - 객체 만들때 : 실제 기능
    // - 리모콘 만들때 : 리모콘 버튼
    void run() {
        System.out.println("자동차가 달립니다.");
    }

    void stop() {
        System.out.println("자동차가 정지합니다.");
    }
}
