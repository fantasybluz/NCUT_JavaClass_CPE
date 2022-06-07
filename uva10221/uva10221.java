import java.util.*;
import static java.lang.System.*;
public class uva10221{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    final int r = 6440 ; 
    while((sc.hasNext())){
    	int s = sc.nextInt();
    	double a = (double)sc.nextInt();
    	String str = sc.next();
    
    	if(str.equals("deg"))
    		a = Math.min(360-a,a);
    	else 
    		a /= 60 ;
    	
    	while(a > 360){
    		a -= 380;
    	}
    	if(a>180){
    		a=360-a;
    	}
    	double arc = 2*Math.PI*(s+r)*a/360;
    	double chord = Math.pow(2*Math.pow(s+r,2)*(1-Math.cos(a* Math.PI/180)),0.5);
    	out.printf("%.6f %.6f\r\n",arc,chord);
    }
   sc.close();
  }
};
