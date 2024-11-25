package com.programmers.month11;

import java.util.ArrayList;
import java.util.List;

public class study_11_25 {
    // 스트림 사용
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person(1, "Alice", 20, 'F'));
        people.add(new Person(2, "Bob", 25, 'M'));
        people.add(new Person(3, "David", 35, 'M'));

        // 문제 : 남성들의 나이의 평균

        System.out.println("== No Stream ==");
        noStreamVersion(people);

        System.out.println("== Stream ==");
        streamVersion(people);
    }

    private static void noStreamVersion(List<Person> people) {
        int sum = 0;
        int itemsOfMan = 0;

        for (Person person : people) {
            if (person.getGender() == 'M') {
                sum += person.getAge();
                itemsOfMan++;
            }
        }

        double avg = (double) sum / itemsOfMan; //자바는 정수 / 정수 일때 몫과 나머지를 구하기 때문에
        // 소수점으로 바꾸려면 피연산자 중 하나를 double로 형변환 해야 함.

        System.out.println("avg of age : " + avg);
    }

    private static void streamVersion(List<Person> people) {
        double avg = people
                .stream()
                .filter(e -> e.getGender() == 'M')
                .mapToInt(e -> e.getAge())
                .average()//OptionalDouble은 double일 수도 있고 아닐 수도 있다는 뜻
                .orElse(0); //아닌 경우(null)에 0으로 치환

        System.out.println("avg of age : " + avg);
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