import java.util.*;
import static java.lang.System.*;

public class uva10908{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int T = sc.nextInt();
    while((T--) > 0 ){
    	int M = sc.nextInt();
    	int N = sc.nextInt();
    	char[][] arr = new char[M][N];  	
    	int Q = sc.nextInt();
    	sc.nextLine();
    	for(int i = 0 ; i < arr.length ; i++){
    		char[] tmp = sc.nextLine().toCharArray();  	
    		for(int j = 0 ; j < tmp.length ; j++)
    			arr[i][j] = tmp[j];    
    	}
    	
    	out.println(arr.length + " " + arr[0].length + " " + Q);
    	
    	while((Q--) > 0 ){    	
    		int r = sc.nextInt();
    		int c = sc.nextInt();     		
    		if(r >= arr.length || c >= arr.length){
    			out.println(1);
    			continue;
    		}
    		char cha = arr[r][c];    		
    		int index = 1 ; 
    		boolean flag  = false ;    		
    		while(true){    			
    			for(int i = r - index ; i <= r+index ; i++){    			
    				for(int j = c - index ; j <= c+index ; j++){    				    					
    					if(i < 0 || j < 0 || i >= M || j >= N || arr[i][j] != cha){    					
    						flag = true ; 
    						break ; 
    					}	
    				}
    				if(flag)break;    				
    			}
    			
    			if(flag)break;
    			else index++;
    		}
    	
    		out.println(index*2-1);
    	}
    	
    }
  }
};
