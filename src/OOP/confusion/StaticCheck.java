package OOP.confusion;

class StaticCaller {
    public static String caller = null;
    public static String getCaller(String arg){
        caller = arg;
        return caller;
    }
}

public class StaticCheck {
    public static void main(String[] args) {
        String caller1 = StaticCaller.getCaller("caller1");
        System.out.println(caller1);
        String caller2 = StaticCaller.getCaller("caller2");
        System.out.println(caller2);
    }
}