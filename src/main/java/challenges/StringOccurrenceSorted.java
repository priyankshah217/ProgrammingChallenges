package challenges;

import java.util.Arrays;

public class StringOccurrenceSorted {
    public String getResultString(String input){
        if(input == null || input.isEmpty()){
            return "";
        }
        String[] words = input.split("");
        int[] count = new int[256];
        for(String word : words){
            count[word.charAt(0)]++;
        }
        Arrays.sort(count);
        System.out.println(Arrays.toString(count));
        return "";
        }
}
