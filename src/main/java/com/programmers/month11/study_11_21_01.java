package com.programmers.month11;

public class study_11_21_01 {
    public static void main(String[] args) {
        System.out.println("== 표준Tv 리모콘 들여오기 전 ==");

        샤오미Tv a샤오미Tv = new 샤오미Tv();
        삼성Tv a삼성Tv = new 삼성Tv();
        LGTv aLGTv = new LGTv();

        a샤오미Tv.켜기(); //ctrl + 1 + enter 하면 추가하고자 하는 메소드가 자동 등록(생성)이 된다
        // 출력 => 샤오미Tv 켜집니다.
        a샤오미Tv.끄기();
        // 출력 => 샤오미Tv 꺼집니다.
        a샤오미Tv.vr켜기();
        // 출력 => 샤오미Tv vr켜기!

        a삼성Tv.켜기();
        // 출력 => 삼성Tv 켜집니다.
        a삼성Tv.끄기();
        // 출력 => 삼성Tv 꺼집니다.
        a삼성Tv.ar켜기();
        // 출력 => 삼성Tv ar켜기!

        aLGTv.켜기();
        // 출력 => LGTv 켜집니다.
        aLGTv.끄기();
        // 출력 => LGTv 꺼집니다.
        aLGTv.게임모드전환();
        // 출력 => LGTv 게임모드전환!

        System.out.println("== 표준Tv 리모콘 들여온 후 ==");

        // 표준Tv 리모콘을 저장할 수 있는 변수를 만든다.
        표준Tv a표준Tv;

        // a표준Tv 변수에 샤오미Tv 객체를 연결한다.
        // 중요 : 다른말로 a샤오미Tv 변수안에 있던 샤오미Tv 리코몬을 표준Tv 리모콘화 해서 a표준Tv변수에 넣는다.
        a표준Tv = a샤오미Tv;
        a표준Tv.켜기();
        // 출력 : 샤오미TV 켜집니다.
        a표준Tv.끄기();
        // 출력 : 샤오미TV 꺼집니다.

        // a표준Tv 변수에 삼성Tv 객체를 연결한다.
        a표준Tv = a삼성Tv;
        a표준Tv.켜기();
        // 출력 : 삼성TV 켜집니다.
        a표준Tv.끄기();
        // 출력 : 삼성TV 꺼집니다.

        // a표준Tv 변수에 LGTv 객체를 연결한다.
        a표준Tv = aLGTv;
        a표준Tv.켜기();
        // 출력 : LGTV 켜집니다.
        a표준Tv.끄기();
        // 출력 : LGTV 꺼집니다.

        // LGTV만의 고유 기능을 표준Tv 리모콘을 이용해서 호출하기 => 불가능
        // (LGTv) => a표준Tv 변수에 있던 표준Tv 리모콘이 LGTv리모콘화 해서 `aLGTv2` 변수에 들어간다.
        LGTv aLGTv2 = (LGTv) a표준Tv;
        aLGTv2.게임모드전환();
    }
}

// 이 클래스는 오직 리모콘을 만들기 위해서 만들어졌습니다.
abstract class 표준Tv {
    abstract void 켜기(); //abstract는 메소드 안에 구현 못함. 추상화여서 내용이 작성 안 되어 있기 때문에
    //만약 표준 Tv를 상속받는 다른 Tv들이 켜기()와 끄기()를 오버라이딩하지만 쓴다고 그러면
    //abstract를 지우고 void 켜기()와 void 끄기()를 구현하여 쓸 수 있도록 바꿀 수 있다.
    //하지만 표준Tv클래스는 new 표쥰Tv; 가 불가능한데 표준Tv클래스로 객체를 만들 경우가
    //거의 없기 때문에 그냥 abstract로 클래스 타입 지정해도 좋다(오히려 추천)
    abstract void 끄기();
}

class 샤오미Tv extends 표준Tv {
    void 켜기() {
        System.out.println("샤오미Tv 켜집니다.");
    }

    void 끄기() {
        System.out.println("샤오미Tv 꺼집니다.");
    }

    void vr켜기() {
        System.out.println("샤오미Tv vr켜기!");
    }
}

class 삼성Tv extends 표준Tv {
    void 켜기() {
        System.out.println("삼성Tv 켜집니다.");
    }

    void 끄기() {
        System.out.println("삼성Tv 꺼집니다.");
    }

    void ar켜기() {
        System.out.println("삼성Tv ar켜기!");
    }
}

class LGTv extends 표준Tv {
    void 켜기() {
        System.out.println("LGTv 켜집니다.");
    }

    void 끄기() {
        System.out.println("LGTv 꺼집니다.");
    }

    void 게임모드전환() {
        System.out.println("LGTv 게임모드전환!");
    }
}
