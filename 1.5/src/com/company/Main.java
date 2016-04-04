package com.company;

public class Main {

    public static void main(String[] args) {
        String s = "aaaaaaabcdefg";
        Compress com = new Compress(s);
        System.out.println(com.CompressString());
    }
}
