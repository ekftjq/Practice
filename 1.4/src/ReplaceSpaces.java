/**
 * Created by Moon on 4/4/2016.
 */
public class ReplaceSpaces {
    String s;
    char[] array;
    StringBuffer sb;

    ReplaceSpaces(String s1){
        s = s1;
        array = s.toCharArray();
        sb = new StringBuffer();
    }

    String Replace(){
        for(int i = 0; i < array.length; i++) {
            if(array[i] == ' ') {
                sb.append("%20");
            }
            else {
                sb.append(array[i]);
            }
        }
        return sb.toString();
    }
}
