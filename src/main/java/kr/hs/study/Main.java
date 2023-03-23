package kr.hs.study;

import kr.hs.study.beans.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        // 1.
        Changeab ab = ctx.getBean("changeAB", Changeab.class);
        ab.pr();

        // 2.
        Threeinteger th = ctx.getBean("three", Threeinteger.class);
        th.pr();

        // 3.
        Comparison co = ctx.getBean("com", Comparison.class);
        co.pr();

        // 4.
        Even even = ctx.getBean("even", Even.class);
        even.pr();

        // 5.
        Unten un = ctx.getBean("unten", Unten.class);
        un.pr();

        ctx.close();
    }
}