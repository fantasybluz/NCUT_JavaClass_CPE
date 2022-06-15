import java.util.*;
import static java.lang.System.*;
public class uva100{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    while(sc.hasNextInt()){
    	int n = sc.nextInt();
    	int m = sc.nextInt();
    	int min = Math.min(n , m);
    	int max = Math.max(n , m);
    	int fin = 0 ; 
    	for(int i = min ; i <= max ; i++ ){
    		int times = 1 ;
    		int idx = i ; 
    		while ( idx != 1 ){
    			idx = idx % 2 ==0 ? idx / 2 : idx * 3 + 1 ;
    			times ++ ;
    		}
    		fin = Math.max(fin , times);
    	}
    	out.println(n + " " + m + " " + fin);
    }
  }
};
