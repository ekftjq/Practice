public class Main {

    public static void main(String[] args) {
        String s = "aab";
        Unique test = new Unique(s);
        System.out.println(test.UniqueChecker());
        //my solution
    }

    //book's solution 1
    public boolean isUniqueChars2(String str) {
        if (str.length() > 256) {
            return false;
        }

        boolean[] char_set = new boolean[256];
        for (int i = 0; i< str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val]) { //already found this char in string
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }

    //book's solution 2
    public boolean isUniqueChars(String str) {
        int checker = 0;
        for (int i = 0; i< str.length(); i++) {
            int val = str.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0) {
                return false;
            }
            checker |= (1 << val);
        }
        return true;
    }
}

