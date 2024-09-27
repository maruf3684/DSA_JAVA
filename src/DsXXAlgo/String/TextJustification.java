package DsXXAlgo.String;

import java.util.ArrayList;
import java.util.List;

public class TextJustification {
    public static void main(String[] args) {
        String [] arr = {"Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"};
        int MAX_WIDTH=20;
        List<String> ans = new ArrayList<>();

        int first_iterator = 0;
        int second_iterator = first_iterator + 1;
        int arr_len = arr.length;

        while(first_iterator<arr_len){
            int letter_count_in_word = arr[first_iterator].length();
            int total_gap = 0;
            int fixed_1_gap = 1;

            while(second_iterator<arr_len && arr[second_iterator].length() + fixed_1_gap + total_gap + letter_count_in_word <= MAX_WIDTH){
                letter_count_in_word = letter_count_in_word + arr[second_iterator].length();
                total_gap = total_gap +1;
                second_iterator += 1;
            }

            int remaining_gaps = MAX_WIDTH - letter_count_in_word;
            int gap_serve_is_every_slot = total_gap == 0 ? 0 : remaining_gaps/total_gap;
            int extra_gap_basche = total_gap == 0 ? 0 : remaining_gaps % total_gap;

            if (second_iterator==arr_len){ //last line left justified
                gap_serve_is_every_slot = 1;
                extra_gap_basche = 0;
            }
            ans.add(makeLine(first_iterator,second_iterator,gap_serve_is_every_slot,extra_gap_basche,MAX_WIDTH,arr));
            first_iterator = second_iterator;
        }
        System.out.println(ans);
    }

    public static String makeLine(int first_iterator,int second_iterator,int gap_serve_is_every_slot, int extra_gap_basche,int MAX_WIDTH, String[] arr){
        StringBuilder s = new StringBuilder();
        for (int i = first_iterator; i < second_iterator; i++) {
           s.append(arr[i]);
           if(i==second_iterator-1){
               break;              //last word of my line
           }

            for (int j = 0; j <= gap_serve_is_every_slot ; j++) {
                s.append(" ");
            }
            if(extra_gap_basche>0){
                s.append(" ");
                extra_gap_basche--;
            }
        }

        while (s.length()< MAX_WIDTH ){
            s.append(" ");
        }
        return s.toString();
    }
}
