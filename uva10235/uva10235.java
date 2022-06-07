import java.util.*;
import static java.lang.System.*;

public class uva10235{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    while(sc.hasNext()){
    	int n = sc.nextInt();
    	boolean flag = false ;
    	for(int i=2; i < n ; i++){
    		if(n % i == 0 ){
    			flag = true ; 
    			break ; 
    		}
    	}
    	
    	if(flag) out.printf("%d is not prime.\r\n",n);
    	else{
    		String num = n+"";
    		String str = "";
    		for(int i = num.length() -1  ; i >= 0 ; i--)
    			str += num.charAt(i);
    		
    		int p = Integer.parseInt(str);
    		flag = false ; 
    		for(int i = 2 ; i < p ; i++){
    			if(p % i == 0 ){
    				flag = true ; 
    				break ;
    			}
    		}    		
    		if(flag || p == n ) out.printf("%d is prime.\r\n", n);
    		else out.printf("%d is emirp.\r\n",n);
    	}
    }
  }
};
