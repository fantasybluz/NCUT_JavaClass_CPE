import java.util.*;
import static java.lang.System.*;
public class uva10929{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    while(sc.hasNext()){
    	String st = sc.next();
    	if(st.equals("0")) break ;
    	int odd = 0 ;
    	int even = 0 ;
    	for(int i = 0 ; i < st.length() ; i++){
    		if ( i %2 == 0 ) even += st.charAt(i) - 48 ;
    		else odd += st.charAt(i) -48;
    	}
    	
    	if((even - odd ) % 11 == 0 )
    		out.println( st +  " is a multiple of 11.");
    	else 
    		out.println(st + " is not a multiple of 11.");
    }
  }
};
