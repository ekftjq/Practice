package practice;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s2 = "waterbottle";
        String s1 = "erbottlewat";
        String s3 = "moonseopkim";
        String s4 = "kimmoonseop";

        System.out.println(isRotation(s3, s4));
        System.out.println(booksolution(s3, s4));
    }

    public static boolean isSubString(String s1, String s2) {
        return s1.contains(s2);
    }

    public static boolean isRotation(String s1, String s2) {
        String a;
        String b;
        String longer;
        for(int i = 1; i< s2.length()/2; i++) {
            a = s2.substring(0, i);
            b = s2.substring(i, s2.length());
            System.out.println("a is : " + a);
            System.out.println("b is : " + b);
            if(a.length() > b.length()) {
                longer = a;
            }
            else {
                longer = b;
            }
            if(isSubString(s1, longer)) {
                //System.out.println(isSubString(s1, a));
                return true;
            }
        }
        return false;
    }

    public static boolean booksolution(String s1, String s2) {
        int len = s1.length();
        if (len == s2.length() && len > 0) {
            String s1s1 = s1 + s1;
            return isSubString(s1s1, s2);
        }
        return false;
    }
}
