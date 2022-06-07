import java.util.*;
import static java.lang.System.*;

public class uva10093{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    
    while(sc.hasNext()){
    	String st = sc.nextLine();
    	char[] cha = st.toCharArray();
    	int sum = 0; 
    	int max = 1 ;
    	for(char tmp : cha){
    		int r = 0 ;
    		if(tmp >= '0' && tmp <= '9')
    			r = tmp - '0';
    		else if (tmp >= 'A' && tmp <= 'Z')
    			r = tmp - 'A' + 10 ;
    		else if (tmp >= 'a' && tmp <= 'z')
    			r = tmp - 'a' + 36;
    		sum += r ;
    		max =  Math.max(max , r );
    	}
    	
    	boolean flag = false ; 
    	for(int i = max ; i <62 ; i++){
    		if(sum % i == 0 ){
    			out.println(i+1);
    			flag = true ; 
    			break ;
    		}
    	}
    	if (!flag){
    		out.println("such number is impossible!");
    	}
    
    }

    sc.close();

  }
};
