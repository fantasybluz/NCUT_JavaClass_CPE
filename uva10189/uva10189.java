import java.util.*;

public class uva10189{
	public static void main(String[] atgs){
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int m = 0;
		int step = 0;
		boolean first = false;
		while(sc.hasNextInt()&& (n = sc.nextInt()) != 0 && (m = sc.nextInt())!= 0){
			if(first){
				System.out.println();
			}
			first = true;
			System.out.println("Field #"+ (++step) + ":");
			String[] cases = new String[n];
			int[][] boom = new int[n+2][m+2];
			for(int i = 0 ;i<n;i++)
				cases[i] = sc.next();
			for(int i=0;i<cases.length;i++){
				char[] cc = cases[i].toCharArray();
				for(int j=0;j<cc.length;j++)
					if(cc[j]=='*')boom[i+1][j+1] = -1;
					else boom[i+1][j+1] = 0;
			}
			CPE(boom);
		
		}
	}
	
	public static void CPE(int[][] boom){


		int tmp;
		for(int i = 1;i<boom.length-1;i++){
			for(int j=1;j<boom[i].length-1;j++){
				if(boom[i][j]==-1){
					 tmp = boom[i-1][j-1] == -1  ? -1 : ++boom[i-1][j-1];
					 tmp = boom[i-1][j] == -1  ? -1 : ++boom[i-1][j];
					 tmp = boom[i-1][j+1] == -1  ? -1 : ++boom[i-1][j+1];
					 tmp = boom[i][j+1] == -1  ? -1 : ++boom[i][j+1];
					 tmp = boom[i][j-1] == -1  ? -1 : ++boom[i][j-1];
					 tmp = boom[i+1][j] == -1  ? -1 : ++boom[i+1][j];
					 tmp = boom[i+1][j+1] == -1  ? -1 : ++boom[i+1][j+1];
					 tmp = boom[i+1][j-1] == -1  ? -1 : ++boom[i+1][j-1];
				}
			}
		}
		
	
		

		
		for(int i = 1 ; i<boom.length-1;i++){
			for(int j = 1 ; j< boom[i].length-1;j++){
				if(boom[i][j]==-1)System.out.print("*");
				else System.out.print(boom[i][j]);
			}
			System.out.println();
		}
	}
}