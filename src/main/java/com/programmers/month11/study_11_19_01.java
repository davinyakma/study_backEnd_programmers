package com.programmers.month11;

public class study_11_19_01 {
    public static void main(String[] args) {
        int a = 50;
        int b = a; // 50은 2군데에 저장되어 있다.(a와 b)

        int[] arr1 = new int[] {10, 20, 30}; // 객체가 힙에 생성되고 그 객체의 리모콘이 arr1 변수에 저장된다.
        int[] arr2 = arr1; // 객체가 2개가 된게 아니라 리모콘만 2개가 되었다.

        arr2 = arr1; //arr1의 값(10,20,30이 담긴 배열의 객체주소값)을 복사
        arr1 = null; //arr1이 객체를 가리키는 주소인데 null로 덮어씌움. 더이상 arr1객체는 Heap영역에서 없어진다.
        //arr1은 삭제되었지만 arr1이 가리키는 값들은 arr2를 이용하여 가리킬 수 있음. 직접 arr2에 배열을 지정하지 않았는데 값이 제대로 출력됨을 확인.
        for (int i = 0; i< arr2.length; i++) {
            System.out.println("배열 " + i +"번째: " + arr2[i]);
        }
    }
}
