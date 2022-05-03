import java.util.*;
import java.lang.*;
public class uva10929 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        while(true){
            String n = sca.next();
            int odd =0, even =0;
            if(n.equals(0)){break;}
            for(int i = 1; i<=n.length(); i++){
                if(i%2 !=0){
                    odd += Integer.parseInt(n.substring(i-1, i));
                }else{
                    even += Integer.parseInt(n.substring(i-1, i));
                }
            }
            if((odd-even)%11 ==0){
                System.out.println(n + " is a multiple of 11.");
            }else{
                System.out.println(n + " is not a multiple of 11.");
            }

        }
    }
}
