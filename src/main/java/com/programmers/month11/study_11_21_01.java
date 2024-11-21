package com.programmers.month11;

public class study_11_21_01 {
    public static void main(String[] args) {
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
    }
}

class 샤오미Tv { //겹치는 켜기, 끄기, vr켜기 메소드가 있으므로 코드를 더 줄이기 위해 Tv클래스에 기본 메소드 정의해서 추상화? 상속 과정이 필요함.
    void 켜기() { //public void 를 쓰던 void만 쓰던 여기서는 중요하지 않다. 똑같은 역할이어서 생략 가능함.
        System.out.println("샤오미Tv 켜집니다.");
    }

    public void 끄기() {
        System.out.println("샤오미Tv 꺼집니다.");
    }

    public void vr켜기() {
        System.out.println("샤오미Tv vr켜기!");
    }
}

class 삼성Tv {

    public void 켜기() {
        System.out.println("삼성Tv 켜집니다.");
    }

    public void 끄기() {
        System.out.println("삼성Tv 꺼집니다.");
    }

    public void ar켜기() {
        System.out.println("삼성Tv ar켜기!");
    }
}

class LGTv {

    public void 켜기() {
        System.out.println("LGTv 켜집니다.");
    }

    public void 끄기() {
        System.out.println("LGTv 꺼집니다.");
    }

    public void 게임모드전환() {
        System.out.println("LGTv 게임모드전환!");
    }
}
