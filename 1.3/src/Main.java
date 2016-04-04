public class Main {

    public static void main(String[] args) {
        String s1 = "abcedfgz";
        String s2 = "hijkl";
        String s3 = "zgfdecba";
        String s4 = "bcedfgza";
        Permutation p = new Permutation(s3, s4);
        System.out.println(p.isPermut());
    }


}
