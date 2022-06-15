import java.util.*;

public class uva11063{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int times = 1;
		while (input.hasNext()){
			boolean flag = false; 
			int A = input.nextInt(); 
			
			int B[] = new int[A];
			boolean Sum[] = new boolean[20001]; 
      
			int current = 0;
			for (int i = 0; i < A; i++){
				B[i] = input.nextInt();
				if (B[i] <= current || B[i] < 1) 
					flag = true;
				current = B[i];
			}
			
			if (!flag){
				for (int i = 0; !flag && i < A; i++)
					for (int j = i; !flag && j < A; j++){
						int add = B[i] + B[j];
						if (!Sum[add])
							Sum[add] = true;
						else
							flag = true;
					}	
			}
				
			if (flag)
				System.out.println("Case #" + times + ": It is not a B2-Sequence.");
			else
				System.out.println("Case #" + times + ": It is a B2-Sequence.");
			times++;
			System.out.println();
		}
	}
}