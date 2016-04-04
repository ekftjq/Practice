/**
 * Created by Moon on 3/31/2016.
 */
public class Unique {
    String s;
    char[] array;

    Unique(String input) {
        s = input;
        array = s.toCharArray();
    }

    public boolean UniqueChecker() {
        for(int i = 0; i<s.length(); i++) {
            for(int j = i+1; j<s.length(); j++) {
                if(array[i] == array[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
