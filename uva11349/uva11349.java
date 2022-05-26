import java.util.*;
import static java.lang.System.*;
public class uva11349{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int cases = sc.nextInt();
    int idx = 0 ; 
    while((++idx) <= cases){
    	sc.next();sc.next();
    	int n = sc.nextInt();
    	
    	long[] size = new long[n*n];
    	for(int i = 0 ; i< size.length ; i++)
    		size[i] = sc.nextLong();
    	
    	boolean flag = false ;
    	for(int i = 0 ; i < size.length ; i++){
    		if( size[i] != size[size.length - 1 - i] || size[i]<0){
    			flag = true ;
    			break ;  	
    		}
    	}
    	if(flag)
    		out.printf("Test #%d: Non-symmetric.\r\n", idx);
    	else 
    		out.printf("Test #%d: Symmetric.\r\n",idx);
    } 
  }
};
