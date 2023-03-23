package kr.hs.study.beans;

// 2. 정수 세 개를 입력받아 합과 평균을 출력하는 프로그램을 작성해보자.
public class Threeinteger {
    int a;
    int b;
    int c;

    public Threeinteger(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void pr(){
        System.out.println("av : " + (a+b+c)/3);
    }

}


