import java.util.* ; 
import static java.lang.System.*;

public class uva272 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean bo = true ;
        while(sc.hasNextLine()){
            String str = sc.nextLine();
            for(int i = 0 ; i < str.length(); i++){
                char c = str.charAt(i);
                if(c == '"') {
                    if(bo) out.print("``");
                    else out.print("''");
                    bo = !bo ; 
                }else 
                    out.print(c);    			
            }
            out.println();
        }

        sc.close();
    }
}