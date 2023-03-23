package kr.hs.study.beans;

// 4. 세 정수 a, b, c가 입력되었을 때 짝수만 출력해보자.
public class Even {
    int a;
    int b;
    int c;

    public Even(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void pr() {
        if(a % 2 == 0) {
            System.out.println("a는 짝수입니다.");
        }
        if (b % 2 == 0) {
            System.out.println("b는 짝수입니다.");
        }
        if (c % 2 == 0) {
            System.out.println("c는 짝수입니다.");
        }

    }
}
