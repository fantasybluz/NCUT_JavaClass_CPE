import java.util.*;
import static java.lang.System.*;

public class uva11005{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int cases  = sc.nextInt();
    int num = 1 ; 
    while((--cases) >= 0 ){
    	int[] cost = new int[36];
    	for(int i = 0; i< cost.length ; i++) cost[i] = sc.nextInt();
    	int count = sc.nextInt();    
    	out.printf("Case %d:\r\n", num);
    	num ++;    	
    	while((--count) >= 0 ){
    		int number = sc.nextInt();
    	
    		int base[] = new int[37];  
    		int min = 0;   		
    		for(int i = 2; i <=36;i++){
    			int temp = number; 
    			int total = 0;
    			while(temp > 0 ){
    				int gas = temp % i ;
    				temp /= i ;
    				total += cost[gas];
    			}
    			base[i] += total ; 
    			min = min == 0 ? total : Math.min(total,min);
    		}
    		out.printf("Cheapest base(s) for number %d:",number);
    		
    		for(int i = 2 ; i<= 36 ; i++){
    			if(base[i] == min)out.print(" "+i);
    		}
    		out.println();
    	}
    	if(cases != 0 )out.println();
    }
  }
};
