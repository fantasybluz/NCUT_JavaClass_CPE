import java.util.*;
import static java.lang.System.*;

public class uva12019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        while ((--cases) >= 0) {
            int y = 2011;
            int m = sc.nextInt();
            int d = sc.nextInt();
            int sum = d;
            switch (m - 1) {
                case 12:
                    sum += 31;
                case 11:
                    sum += 30;
                case 10:
                    sum += 31;
                case 9:
                    sum += 30;
                case 8:
                    sum += 31;
                case 7:
                    sum += 31;
                case 6:
                    sum += 30;
                case 5:
                    sum += 31;
                case 4:
                    sum += 30;
                case 3:
                    sum += 31;
                case 2:
                    sum += ((y % 4 == 0 && y % 100 == 0) || y % 400 == 0) ? 29 : 28;
                case 1:
                    sum += 31;
            }
            sum += (y - 1) * 365 + (y - 1) % 4 + (y - 1) % 100 - (y - 1) % 400;
            String o = "";
            switch (sum % 7) {
                case 0:
                    o = "Tuesday";
                    break;
                case 1:
                    o = "Wednesday";
                    break;
                case 2:
                    o = "Thursday";
                    break;
                case 3:
                    o = "Friday";
                    break;
                case 4:
                    o = "Saturday";
                    break;
                case 5:
                    o = "Sunday";
                    break;
                case 6:
                    o = "Monday";
                    break;
            }
            out.println(o);
        }
        sc.close();
    }

}