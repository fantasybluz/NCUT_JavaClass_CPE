import java.util.*;
import static java.lang.System.*;
public class uva11417{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n = 0;
    while(sc.hasNextInt()){
    	n = sc.nextInt();
    	if(n == 0 )break ; 
    	
    	int sum = 0 ; 
    	for(int i =0 ; i < n ; i++){
    		for(int j = i+1 ; j <= n ; j++)
    			sum += GCD(i,j);
    	}
    	
    	out.println(sum);
    }
  }
  
  public static int GCD(int a , int b ){
  	if(a == 0 && b != 0 ) return a ;
  	if(b == 0 ) return a ;
  	else return GCD(b , a%b);
  }
};
