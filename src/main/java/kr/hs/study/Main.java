package kr.hs.study;

import kr.hs.study.beans.Changeab;
import kr.hs.study.beans.Comparison;
import kr.hs.study.beans.Even;
import kr.hs.study.beans.Threeinteger;
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

        ctx.close();
    }
}