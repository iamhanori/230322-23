package kr.hs.study.beans;

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


