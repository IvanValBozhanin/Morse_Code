package com.company;

import java.util.Arrays;

public class MorseCode {
    private static final String [] data ={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.--",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

    public MorseCode() {
    }

    public static String encode(String s){
        StringBuilder st = new StringBuilder(data[s.charAt(0) - 'A']);
        for(int i = 1;i<s.length(); ++i){
            st.append(" ").append(data[s.charAt(i) - 'A']);
        }
        return st.toString();
    }

    public static String decode(String s){
        StringBuilder curr = new StringBuilder();
        StringBuilder glo = new StringBuilder();
        for(int i=0;i<s.length(); ++i){
            curr.append(s.charAt(i));
            if(i + 1 == s.length() || s.charAt(i + 1) == ' '){
                glo.append((char) ('A' + Arrays.asList(data).indexOf(curr.toString())));
                ++i;
                curr = new StringBuilder();
            }
        }
        return glo.toString();
    }
}
