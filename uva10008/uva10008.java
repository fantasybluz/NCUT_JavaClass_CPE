import java.util.*;

public class uva10008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        sc.nextLine();
        int[] count = new int[26];
        int max = 0;
        while ((lines--) > 0) {
            String st = sc.nextLine().toUpperCase();
            for (int i = 0; i < st.length(); i++) {
                char cr = st.charAt(i);
                if (cr >= 65 && cr <= 90) {

                    count[cr - 65]++;
                    max = Math.max(max, count[cr - 65]);
                }
            }
        }

        while (max > 0) {
            for (int i = 0; i < count.length; i++) {
                if (count[i] == max) {
                    int tmp = i + 65;
                    System.out.println((char) tmp + " " + count[i]);
                }
            }
            max--;
        }
    }

}