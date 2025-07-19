package Annotation;

import java.lang.annotation.*;

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented

@interface MyCustom2{
    int value1() default 1;
    String name() default "maruf";
}

class MyCustom2Processor{

}

@MyCustom2(value1 = 2,name = "kuddus")
public class BasicClass2 {
}

class Main2{
    public static void main(String[] args) {

    }
}


