import java.util.*;

public class uva10038{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int cases = sc.nextInt();
			int[] arr = new int[cases];
			int[] arr2 = new int[cases];
			int point = 0;
			for(int i =0; i< arr.length;i++)
				arr[i] = sc.nextInt();
			boolean chk = false;
			for(int i=1;i<arr.length;i++){
				int num = Math.abs(arr[i]-arr[i-1]);
				if(num > arr.length-1|| num <1 ){
					chk = true;
					break;
				}else{
					for(int j = 0;j<arr2.length;j++){
						if(arr2[j]==0)break;
						if(arr2[j]==num){
							chk = true;
							break;
						}
					}
					arr2[point] = num;
					point++;
				}
					
			}
			
			if(!chk)System.out.println("Jolly");
			else System.out.println("Not jolly");
		}
	}
}
