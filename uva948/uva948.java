import java.util.*;
import static java.lang.System.*;

public class uva948{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
   	int cases = sc.nextInt();
   	int arr[] = new int[50];
   	arr[0] = 1;
   	arr[1] = 2;
   	
   	for(int i = 2 ; i< 43 ; i++)
   		arr[i] = arr[i-1] + arr[i-2];
   	
   	
   	while((--cases) >= 0 ){
   		int n = sc.nextInt();
   		int i = 42 ; 
   		while( n < arr[i])
   			i--;
   			
   		out.print(n + " = ");
   		
   		while( i>= 0 ){
   			if( n >= arr[i]){
   				n -= arr[i];
   				out.print("1");
   			}else 
   				out.print("0");
   			i--;   			
   		}
   		
   		out.println(" (fib)");
   	
   	}
  }
};
