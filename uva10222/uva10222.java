import java.util.*;

public class uva10222 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = new String[] { "q", "w", "e", "r", "t", "y", "u", "i", "o", "p", "[", "]" };
        String[] b = new String[] { "a", "s", "d", "f", "g", "h", "j", "k", "l", ";", "'" };
        String[] c = new String[] { "z", "x", "c", "v", "b", "n", "m", ",", "." };

        while (sc.hasNext()) {
            String str = sc.nextLine();
            for (int i = 0; i < str.length(); i++) {
                char cha = str.charAt(i);

                if (cha >= 65 && cha <= 90)
                    cha += 32;
                if (cha == ' ') {
                    System.out.print(' ');
                    continue;
                }

                boolean bo = false;
                for (int j = 0; j < a.length; j++) {
                    if (a[j].equals(cha + "")) {
                        System.out.print(a[j - 2 < 0 ? j : j - 2]);
                        bo = true;
                        break;
                    }
                }

                if (bo)
                    continue;

                for (int j = 0; j < b.length; j++) {
                    if (b[j].equals(cha + "")) {
                        System.out.print(b[j - 2 < 0 ? j : j - 2]);
                        bo = true;
                        break;
                    }
                }

                if (bo)
                    continue;
                for (int j = 0; j < c.length; j++) {
                    if (c[j].equals(cha + "")) {
                        System.out.print(c[j - 2 < 0 ? j : j - 2]);
                        bo = true;
                        break;
                    }
                }

                if (bo)
                    continue;
            }
            System.out.println();
        }

    }
}