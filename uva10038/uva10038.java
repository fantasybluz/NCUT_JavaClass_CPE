import java.util.*;
import static java.lang.System.*;

public class uva10038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int cases = sc.nextInt();

            int[] size = new int[cases];
            int[] cap = new int[cases - 1];
            for (int i = 0; i < size.length; i++)
                size[i] = sc.nextInt();
            if (cases == 1) {
                out.println("Jolly");
                continue;
            }
            for (int i = 0; i < cap.length; i++)
                cap[i] = Math.abs(size[i] - size[i + 1]);
            Arrays.sort(cap);
            int idx = cap[0];
            boolean res = false;
            for (int i = 1; i < cap.length; i++) {
                if (idx == cap[i] - 1)
                    idx++;
                else {
                    res = true;
                    break;
                }
            }
            if (res || (cap.length == 1 && cap[0] != 1))
                out.println("Not jolly");
            else
                out.println("Jolly");
        }
        sc.close();
    }

}