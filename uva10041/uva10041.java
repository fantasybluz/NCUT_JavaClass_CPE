import java.util.*;
public class uva10041{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
 	int cases = sc.nextInt();
 	while((--cases) >=0){
 		int size = sc.nextInt();
 		int[] arr = new int[size];
 		for(int i = 0 ; i< size ; i++)
 			arr[i] = sc.nextInt(); 		
 		Arrays.sort(arr); 		
 		int len = 0 ;
 		for(int i = 0 ; i<size ; i++){
 			len += Math.abs(arr[i] - arr[i/2]); 		
        }	
 		System.out.println(len);
 	}
    sc.close();
  }  
};