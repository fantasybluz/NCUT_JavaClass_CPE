import java.util.*;
import static java.lang.System.*;

public class uva11063{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int idx = 1 ;
    while(sc.hasNext()){
    	int cases = sc.nextInt();
    	int[] size = new int[cases];
    	for(int i = 0 ; i < size.length ; i++)size[i] = sc.nextInt();
    	boolean flag = false ; 
    	
    	List<Integer> list = new ArrayList<Integer>();
    	
    	for(int i = 0 ; i< size.length ; i++){
    		if(size[i]<=0){flag = true;break;}
    		for(int j = i+1 ; j < size.length ; j++){
    			int sum = size[i]+size[j];
    			if(list.contains(sum)){
    				flag = true ;
    				break ;
    			}else 
    				list.add(sum);
    		}    		
    	}
    	
    	if(flag)
    		out.printf("Case #%d: It is not a B2-Sequence.\r\n",idx);
    	else 
    		out.printf("Case #%d: It is a B2-Sequence.\r\n", idx );
    	idx ++ ;
    	out.println();
    }
  }
};
