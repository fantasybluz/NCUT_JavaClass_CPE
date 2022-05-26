import java.util.*;
import static java.lang.System.*;
public class uva11461{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    while(sc.hasNext()){
    	int a=sc.nextInt();
    	int b=sc.nextInt();
    	if (a == 0 || b ==0 ) break ; 
    	int num = 0 ;
    	for(int i = a ; i <= b ; i++){
    		double nu = Math.sqrt(i);
    		if( nu*1000 % 10 == 0 ) num++;
    	}
    	out.println(num);    	
    }   
    sc.close();
  }  
};
