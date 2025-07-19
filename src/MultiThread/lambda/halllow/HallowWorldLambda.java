package MultiThread.lambda.halllow;

public class HallowWorldLambda {
    public static void main(String[] args) {
        HalloWorldInterface s = ()->{
            System.out.println("Hello World");
            System.out.println("hello");
        };
        s.sayHallow();
    }
}
