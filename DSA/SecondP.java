
import java.util.*;

public class SecondP {

    public static boolean Happynumber(int n) {
        int len = count1(n);
        if (len == 1 && n != 1) {
            return false;
        } else if (len == 1 && n == 1) {
            return true;
        }
        int a = n;
        int sum = 0;
        while (a != 0) {
            int r = a % 10;
            sum += Math.pow(r, 2);
            a = a / 10;
        }
        if (sum == 1) {
            return true;
        } else {
            return Happynumber(sum);
        }
    }

    public static int count1(int n1) {
        int c = 0;
        while (n1 != 0) {
            int a = n1 % 10;
            n1 = n1 / 10;
            c = c + 1;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(Happynumber(number));
    }
}
