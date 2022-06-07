import java.util.*;
import static java.lang.System.*;
public class uva10050{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int cases = sc.nextInt();
    while((--cases) >= 0 ){
    	boolean[] week = new boolean[sc.nextInt()];    	
    	int people = sc.nextInt();
    	int num = 0 ;
    	for(int i = 0;i < people ; i++){    		    		
    		int party = sc.nextInt();    		
    		for(int j = party ; j <= week.length ; j+= party){
    			if(j % 7 != 0 && j %7 != 6 ){
    				week[j-1] = true;
    				
    			}
    		}    		
    	}
    	
    	for(int i = 0 ; i < week.length ; i++)
    		if(week[i]) num++;
    	out.println(num);
    	
    }
  }
};
