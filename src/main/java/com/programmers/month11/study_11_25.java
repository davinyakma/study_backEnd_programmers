package com.programmers.month11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        List<String> names = new ArrayList<>();

        for (Person person : people) {
            if (person.getGender() == 'M') {
                names.add(person.getName());
            }
        }

        String manNames = String.join(", ", names);

        System.out.println("manNames : " + manNames);
    }

    //.map(person -> person.getName)과 같음 .map(person::getName)
    // 왜 mapToObj로 안 했는가? String사람 이름은 원래도 레퍼런스 타입이여서 필요없음.
    private static void streamVersion(List<Person> people) {
        String manNames = people.stream()
                .filter(person -> person.getGender() == 'M')
                .map(Person::getName)
                .collect(Collectors.joining(", ")); //이름들 사이에 구분자 ","로 설정

        System.out.println("manNames : " + manNames);
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