import java.util.*;
import static java.lang.System.*;

public class uva10170 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            long s = sc.nextLong();
            long d = sc.nextLong();
            long stamp = s + 1;
            long count = s;
            while (s < d) {
                s += stamp;
                stamp++;
                count++;
            }
            out.println(count);
        }
        sc.close();
    }
}