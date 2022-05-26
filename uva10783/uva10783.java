import java.util.*;
import static java.lang.System.*;

public class uva10783{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cases = sc.nextInt();
        int tmp = 0 ; 
        while((tmp++) < cases ){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int res = 0 ;
            if (n%2 == 0 ) n++;
            for(int i = n ; i <= m ; i+=2){
                res += i ; 
            }
            if(tmp < 10 )
                out.printf("Case%2d: %d",tmp,res);
            else 
                out.printf("Case %2d: %d",tmp,res);
            out.println();
        }
        
        sc.close();
    }
}