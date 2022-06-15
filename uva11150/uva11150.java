import java.util.Scanner;

public class uva11150{
	public static void main(String args[]){
	    Scanner sc = new Scanner(System.in);
	    while(sc.hasNext()){
	        int a = sc.nextInt();
	        int b = 1 ; 
	        if(a % 2 != 0 ){
	            System.out.println( (a / 2 * 3 + b));
	        }else System.out.println(a / 2 * 3 ) ;
	    }
	}
	
}