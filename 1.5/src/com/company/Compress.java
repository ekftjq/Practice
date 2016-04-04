package com.company;

/**
 * Created by Moon on 4/4/2016.
 */
public class Compress {
    String s;
    char[] array;
    StringBuffer sb;
    int count;

    Compress(String a) {
        s = a;
        array = s.toCharArray();
        sb = new StringBuffer();
        count = 0;
    }

    String CompressString() {
        int i = 0;
        while(i < s.length()-1) {
            sb.append(array[i]);
            count++;
            while(i < s.length()-1 && array[i] == array[i+1]) {
                count++;
                i++;
            }
            sb.append(count);
            i++;
            count = 0;
        }
        if(sb.toString().length() < s.length()) {
            return sb.toString();
        }
        else {
            return s;
        }
    }
}
