import java.util.*;
import static java.lang.System.*;
public class uva11321{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    while(true){
    	int n=sc.nextInt();
    	int m=sc.nextInt();
    	if(n == 0 )break; 
    	Integer[] arr = new Integer[n];
    	for(int i = 0 ; i< arr.length ; i++)
    		arr[i] = sc.nextInt();    
    	out.println(n + " " + m );
    	Arrays.sort(arr , new Sort(m));
    	for (int i : arr )
    		out.println(i);    	
    }
    out.println(0 + " " + 0 );
   
    sc.close();
  }
  
  static class Sort implements Comparator<Integer>
  {
	int mod; 
	
	Sort(int a ){ this.mod = a; }
	
	@Override
	public int compare(Integer a , Integer b ){
		if (a == b ) return 0 ;
		int _a = a%mod ;
		int _b = b%mod ;
		if (_a != _b )
			return _a > _b ? 1 : -1 ;
		if((a & 1 ) != (b & 1 ))
			return (a & 1 ) == 1 ? -1 : 1;
		if((a & 1 )==0)
			return a > b ? 1 : -1 ;
		return a > b ? -1 : 1;
		
	}
   }
};