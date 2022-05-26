import java.util.*;
import static java.lang.System.*;
public class uva10812{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int cases = sc.nextInt();
    while((cases--) > 0 ){
    	int s = sc.nextInt();
    	int d = sc.nextInt();    	
    	int m = s / 2 ;
    	int fin1 = m + (d%2 == 0 ? d/2 : d/2+1 );
    	int fin2 = m - (d/2);
    	
    	if (s < d || (fin1 + fin2) != s || (fin1 - fin2) != d  )
    		out.println("impossible");
    	else 
    		out.println(fin1 + " " + fin2);    	
    		 	
    }
  }
};