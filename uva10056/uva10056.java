import java.util.*;
import static java.lang.System.*;

public class uva10056 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        while ((--cases) >= 0) {
            int n = sc.nextInt();
            double p = sc.nextDouble();
            int m = sc.nextInt();

            double q = 1 - p;
            if (p == 0)
                out.printf("%.4f", p);
            else {
                double a = p * Math.pow(q, m - 1);
                double r = 1 - Math.pow(q, n);
                out.printf("%.4f", a / r);
            }
            out.println();
        }
        sc.close();
    }

}