package kr.hs.study.beans;

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

        // 모두가 짝수아 아닐 경우도..
    }
}
