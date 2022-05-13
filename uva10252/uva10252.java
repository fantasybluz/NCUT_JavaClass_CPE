import java.util.*;

public class uva10252 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String a = sc.nextLine();
            String b = sc.nextLine();
            int[] arr1 = new int[26];
            int[] arr2 = new int[26];

            for (int i = 0; i < a.length(); i++) {
                for (int j = 0; j < b.length(); j++) {
                    if (a.charAt(i) == b.charAt(j) && a.charAt(i) != ' ') {
                        arr1[a.charAt(i) - 97]++;
                        break;
                    }

                }
            }

            for (int i = 0; i < b.length(); i++) {
                for (int j = 0; j < a.length(); j++) {
                    if (b.charAt(i) == a.charAt(j) && b.charAt(i) != ' ') {
                        arr2[b.charAt(i) - 97]++;
                        break;
                    }

                }
            }

            for (int i = 0; i < 26; i++) {
                if (arr1[i] == 0 || arr2[i] == 0)
                    continue;

                int num = Math.min(arr1[i], arr2[i]);
                for (int j = 0; j < num; j++) {
                    System.out.print((char) (i + 97));
                }
            }
            System.out.println();

        }
    }
}