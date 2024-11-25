package com.programmers.month11;

import java.util.Arrays;

public class study_11_25 {
    // 스트림 사용
    //# 문제
    //- 원본 : new String[] {"1번", "2번", "3번"}
    //- 결과 : new int[] {1, 3}
    //- 조건은 짝수 제거
    public static void main(String[] args) {
        System.out.println("== No Stream ==");
        noStreamVersion();

        System.out.println("== Stream ==");
        streamVersion();
    }

    private static void noStreamVersion() {
        String[] messages = new String[]{"1번", "2번", "3번"};
        //int[] numbers = new int[]{messages.length};
        int[] numbers = new int[messages.length];

        for (int i = 0; i < messages.length; i++) {
            String message = messages[i];
            //"번"을 제거. message에서 가장 마지막 한자를 제거
            message = message.substring(0, message.length() -1);

            int number = Integer.parseInt(message);

            if (number % 2 == 0) continue;
            numbers[i] = number;
            messages[i] = numbers[i] + "번";
        }

        System.out.println("= 원본 =");
        System.out.println(Arrays.toString(messages));
        System.out.println("= 결과 =");
        System.out.println(Arrays.toString(numbers)); //결과가 [1,3] 이 되어야 하는데 [1,0,3]이 되는 문제가 있음. 복잡함
    }

    private static void streamVersion() {
        int[] array = Arrays.stream(new String[]{"1번", "2번", "3번"})
                .map(e -> e.substring(0, e.length() - 1))
                .mapToInt(Integer::parseInt)
                .filter(number-> number % 2 != 0)
                .toArray();

        System.out.println("= 결과 =");
        System.out.println(Arrays.toString(array));
    }
}