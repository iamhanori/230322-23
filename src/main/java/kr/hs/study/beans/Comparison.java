package kr.hs.study.beans;

// 3. 정수 a, b를 입력받아 a>b 면 1, a<b 면 0, 같으면 a==b를 출력하는 프로그램을 작성해보자.
public class Comparison {
    int a;
    int b;

    public Comparison(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void pr() {
        if(a == b) {
            System.out.println("a==b, a와 b는 같습니다.");
        }
        else if (a > b) {
            System.out.println("1. a는 b보다 큽니다.");
        }
        else {
            System.out.println("0. b는 a보다 큽니다.");
        }

    }
}

