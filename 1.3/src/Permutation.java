import java.util.Arrays;

/**
 * Created by Moon on 3/31/2016.
 */
public class Permutation {
    String s1;
    String s2;

    //abcde
    //edcba

    Permutation(String a, String b) {
        s1 = a;
        s2 = b;
    }

    public boolean isPermut() {
        if(s1.length() != s2.length()) {
            return false;
        }
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a, b)) {
            return true;
        }
        return false;
    }
}
