import static java.lang.System.out ; 
import java.util.*;

public class uva490 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<String> vector = new Vector<String>();
        int maxlen = 0;
        int cases = 0;
        while (sc.hasNextLine()) {
            cases++;
            String st = sc.nextLine();
            vector.add(st);
            maxlen = Math.max(maxlen, st.length());
        }

        for (int i = 0; i < maxlen; i++) {
            int count = 0;
            for (int j = cases - 1; j >= 0; j--) {
                if (!(i >= vector.get(j).length())) {
                    while (count > 0) {
                        out.print(" ");
                        count--;
                    }
                    out.print(vector.get(j).charAt(i));
                } else
                    count++;

            }
            out.println();
        }
    }

}