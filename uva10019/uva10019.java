import java.util.*;
import static java.lang.System.*;

public class uva10019{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
   	int cases = sc.nextInt();
   	while((--cases) >= 0 ){
   		int num = sc.nextInt();
   		String decimal = Integer.toString(num , 2 );
   		int a = 0 ;
   		
   		for(int i =0;i<decimal.length(); i++)
   			if(decimal.charAt(i) == '1')a++;
   		String hax = Integer.toString(num , 16);
   		int b = HAX(num+"");
   		out.println(a + " " + b );
   	}
  }
  
  public static int HAX(String str){
  
  	int num = 0 ;
  	for(int i = 0 ; i< str.length();i++){
  		String c = (str.charAt(i)+"").toUpperCase();
  		char cha = c.charAt(0);
  		int idx = 0 ;
  		if(cha >= 'A' && cha <= 'Z'){
  			idx = cha - 'A' + 10;  		
  		}else idx = cha - '0';
  	
		String binary = Integer.toString(idx , 2);
		
		for(int j = 0 ; j < binary.length() ; j++){
			if(binary.charAt(j) == '1')num++;
		}
  	
  	}
  	return num;
  }
};
