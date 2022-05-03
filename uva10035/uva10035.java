import java.util.*;

public class uva10035 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int a = sca.nextInt();
        int b = sca.nextInt();
        int temp = 0,carry = 0;
        while (a > 0 || b > 0) {
            if ((a % 10) + (b % 10) + temp >= 10) {
                carry++;
                temp = 1;
            } else {
                temp = 1;
            }
            a /= 10;
            b /= 10;
        }
        if (carry == 0) {
            System.out.println("No carry opration.");
        } else {
            System.out.println(carry + " carry operation.");
        }
    }
}
