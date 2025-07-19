package Annotation;

import java.lang.annotation.*;
import java.lang.reflect.Method;

@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Loggable {
    String level() default "INFO";
}

class MyService {
    @Loggable(level = "DEBUG")
    public void performTask() {
        System.out.println("Task performed.");
    }
}

public class AnnotationProcessor {
    public static void main(String[] args) throws Exception {
        MyService service = new MyService();
        Method method = service.getClass().getMethod("performTask");
        if (method.isAnnotationPresent(Loggable.class)) {
            Loggable loggable = method.getAnnotation(Loggable.class);
            System.out.println("Logging at level: " + loggable.level());
        }
        service.performTask();
    }
}