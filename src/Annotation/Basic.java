package Annotation;

import java.lang.annotation.*;

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyCustom1{
    int value1() default 1;
    String name() default "maruf";
}

@MyCustom1(value1 = 2,name = "kuddus")
public class Basic {
}

class Main1{
    public static void main(String[] args) {
        Basic basic = new Basic();
        Class c = basic.getClass();
        System.out.println(c.getSimpleName());

        Annotation an = c.getAnnotation(MyCustom1.class);
        System.out.println(an);

        MyCustom1 m = (MyCustom1) an;
        System.out.println(m.value1());
        System.out.println(m.name());
    }
}