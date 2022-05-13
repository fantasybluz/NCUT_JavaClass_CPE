import java.util.*;

public class uva10420 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        String[] country = new String[cases];
        Set<String> s = new HashSet<String>();

        for (int i = 0; i < cases; i++) {
            country[i] = sc.next();
            s.add(country[i]);
            String No = sc.nextLine();
        }

        Arrays.sort(country);
        String[] arr = s.toArray(new String[s.size()]);
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < country.length; j++) {
                if (arr[i].equals(country[j]))
                    count++;
            }
            System.out.println(arr[i] + " " + count);
        }

    }
}