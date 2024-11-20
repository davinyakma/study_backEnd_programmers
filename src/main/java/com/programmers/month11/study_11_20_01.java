package com.programmers.month11;

public class study_11_20_01 {
    public static void main(String[] args){
        class Person {
            int maxSpeed;
            static int maxSpeed2;
        }

        Person p1 = new Person();
        p1.maxSpeed = 100;
        // 이 코드는 실질적으로 `Person.maxSpeed = 100;` 으로 처리된다. 왜냐하면 p1 객체에는 maxSpeed 변수가 없고, maxSpeed 변수는 클래스에 1개만 존재하기 때문이다.
        p1.maxSpeed2 = 100;
        Person p2 = new Person();
        p2.maxSpeed = 200;
        p2.maxSpeed2 = 200;
        Person p3 = new Person();
        p3.maxSpeed = 300;
        p3.maxSpeed2 = 300;

        //static변수 maxSpeed2는 코드 실행 후에 객체p1이든 p2든, p3 모두 Person의 maxSpeed2를 뜻하기 때문에
        //maxSpeed2의 print문의 결과가 300으로 일치한다. p3.maxSpeed2 = 300으로 변경되었기 때문임.
        System.out.println(p1.maxSpeed); // 100
        System.out.println(p1.maxSpeed2); // 300
        System.out.println(p2.maxSpeed); // 200
        System.out.println(p2.maxSpeed2); // 300
        System.out.println(p3.maxSpeed); // 300
        System.out.println(p3.maxSpeed2); // 300
    }
}

