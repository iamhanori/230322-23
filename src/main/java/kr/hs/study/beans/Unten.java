package kr.hs.study.beans;

// 5. 2자리 정수를 입력받아 10의자리와 1의자리가 같은지 여부를 판단하는 프로그램을 작성하자.
public class Unten {
    int a;
    int b;
    int num;

    public Unten(int num) {
        this.num = num;
    }

    public void pr() {
        a = num / 10; // 10의 자리
        b = num % 10; // 1의 자리

        if(a==b) {
            System.out.println("O 10의 자리와 1의 자리가 같습니다.");
        }
        else {
            System.out.println("X 10의 자리와 1의 자리가 다릅니다.");
        }

    }

}
