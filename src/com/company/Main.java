package com.company;

public class Main {

    public static void main(String[] args) {
        String s1 = "IVANEGOTINPICH";
        System.out.println(MorseCode.encode(s1));
        System.out.println(MorseCode.decode(MorseCode.encode(s1)));

        System.out.println(MorseCode.encode("ABCDEFG"));
        System.out.println(MorseCode.decode(MorseCode.encode("ABCDEFG")));
    }
}
