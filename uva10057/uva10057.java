import java.util.*;
import static java.lang.System.*;
public class uva10057{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    
    while((sc.hasNextInt())){
    	int[] cases = new int[sc.nextInt()];
    	for(int i=0; i < cases.length ; i++)
    		cases[i] = sc.nextInt();
    	
    	Arrays.sort(cases);    	
    
    	int mid = cases[(cases.length-1) / 2];
    	int mid2 = cases[cases.length / 2 ];
    	
    	int count = 0 ;
    	for(int i = 0 ; i < cases.length ; i++){
    		if(mid == cases[i] || mid2 == cases[i]) count++;
    	}
    	
    	int min = cases.length % 2 == 0 ? mid2-mid+1 : 1 ;
    	out.println(mid+" " + count+" " + min );
    }
  }
};