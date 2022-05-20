import java.util.*;
import static java.lang.System.*;

public class uva10268 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int x = sc.nextInt();
            sc.nextLine();
            String[] a = sc.nextLine().split(" ");
            int n = a.length - 1;
            int res = 0;
            for (int i = 0; i < a.length; i++) {
                int val = Integer.parseInt(a[i]);
                res += val * n * Math.pow(x, n - 1);
                n--;
            }
            out.println(res);
        }
        sc.close();
    }

}