package com.programmers.month11;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class study_11_25 {
    // 스트림 사용
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person(1, "Alice", 20, 'F'));
        people.add(new Person(2, "Bob", 25, 'M'));
        people.add(new Person(3, "David", 35, 'M'));

        // 문제 : 남성의 이름들

        System.out.println("== No Stream ==");
        noStreamVersion(people);

        System.out.println("== Stream ==");
        streamVersion(people);
    }

    private static void noStreamVersion(List<Person> people) {
        Person found = null; // 검색 결과를 저장할 변수 초기화

        for (Person person : people) { // 리스트의 모든 요소를 반복
            if (person.getId() == 2) { // id가 2인 객체를 찾으면
                found = person; // 찾은 객체를 found에 저장
                break; // 반복문 종료
            }
        }

        if (found == null) { // 찾지 못한 경우
            System.out.println("not found"); // 'not found' 출력
            return; // 메서드 종료
        }

        System.out.println("found : " + found.getName()); // 찾은 객체의 이름 출력
    }

    private static void streamVersion(List<Person> people) {
        Optional<Person> opPerson = people.stream() // 스트림 생성
                .filter(e -> e.getId() == 2) // 조건에 맞는 객체 필터링
                .findFirst(); // 첫 번째로 조건을 만족하는 객체를 찾음

        Person found = opPerson.orElse(null); // Optional이 비어 있으면 null 반환
        //Optional 사용 : 값이 없을 때 null을 리턴하지 않도록 방지.
        //값의 존재 여부를 간단하게 확인 가능.
        //NullPointerException 방지.
        if (found == null) { // 찾지 못한 경우
            System.out.println("not found"); // 'not found' 출력
            return; // 메서드 종료
        }

        System.out.println("found : " + found.getName()); // 찾은 객체의 이름 출력
    }
}

class Person {
    private int id;
    private String name;
    private int age;
    private char gender;

    public Person(int id, String name, int age, char gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }
}