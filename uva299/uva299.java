import java.util.*;

public class uva299{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for(int i=0;i<cases;i++){
			int len = sc.nextInt();
			int[] buble = new int[len];
			for(int j=0;j<buble.length;j++){
				buble[j] = sc.nextInt();
			}
			CPE(buble);
		}
	}
	public static void CPE(int[] buble){
		int step = 0;
		for(int i=0;i<buble.length;i++)
			for(int j=i;j<buble.length;j++){
				if(buble[i]>buble[j]){
					int tmp = buble[j];
					buble[j] = buble[i];
					buble[i] = tmp;
					step ++;
				}
			}
		System.out.println("Optimal train swapping takes " + step + " swaps." );
	}
}