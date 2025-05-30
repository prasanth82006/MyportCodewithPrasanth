
import java.util.*;

public class firstP {

    public static int MiniumOperators(String a, String b) {
        int n1 = a.length();
        int n2 = b.length();
        int count = 0;
        if (n1 != n2) {
            count = n1 - n2;
            if (!a.contains(b)) {
                count++;
            }
            return count;
        } else {
            for (int i = 0; i < n1; i++) {
                for (int j = i; j < n2; j++) {
                    if (a.substring(i, j).equals(b.substring(i, j))) {
                        String ab = a.substring(i, j);
                        int n = ab.length();
                    }
                }
            }
            count = n1 - n2;
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(MiniumOperators(s1, s2));
    }
}
