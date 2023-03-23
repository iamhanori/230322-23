package kr.hs.study.beans;

// 1. 두 개의 문자를 입력받은 후 순서를 바꿔서 출력해보자.
public class Changeab {
    String a;
    String b;

    public Changeab(String a, String b){
        this.a = b;
        this.b = a;
    }

    public void pr(){
        System.out.println(a+", "+b);
    }
}
