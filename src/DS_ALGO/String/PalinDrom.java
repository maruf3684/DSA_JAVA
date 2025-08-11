package DS_ALGO.String;

public class PalinDrom {
    public static void main(String[] args) {
        System.out.println("hop".substring(0,1));
        System.out.println(isPalin("abb",0,0));
    }

    public static boolean isPalin(String st,int start,int end){
        while(start<=end){
            if(st.charAt(start) != st.charAt(end)){
                return false;
            }
            start ++;
            end --;
        }
        return true;
    }
}
