import java.util.*;
import static java.lang.System.*;
public class uva10035{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    while(sc.hasNextInt()){
    	int n = sc.nextInt();
    	int m = sc.nextInt();
    	int times = 0 ; 
    	int carry = 0 ;
    	if(n == 0 && m == 0 ) break ; 
    	while( n != 0 || m != 0 ){
    		if(n % 10 + m % 10 + carry >= 10 ){
    			times ++ ;
    			carry = 1 ;
    		}else carry = 0  ;
    		n /= 10 ;
    		m /= 10 ;     			
    	}
    	switch (times){
    		case 0 : 
    			out.println("No carry operation.");
    			break ; 
    		case 1 :
    			out.println(times + " carry operation.");
    			break ;
    		default :
    			out.println(times + " carry operations.");
    			break;
    	}
    	
    }
  }
};
