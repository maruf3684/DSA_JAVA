package Toptal;

public class CountMissingTags {
    public static void main(String[] args) {
        String tag = "<app></app></app></app></app><app></app></app></app>";
        int start = 0;
        int end = 0;

        int open = 0;
        int close = 0;
        while (start < tag.length()) {
            if (tag.charAt(start) == '>') {
                int length = start - end;
                if (length == 4) {
                    open++;
                }else{
                    close++;
                }
                start++;
                end = start;

            }else {
                start ++;
            }
        }

        System.out.println(close-open);
    }
}
