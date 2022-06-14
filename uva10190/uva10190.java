import java.util.Scanner;

public class uva10190 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()) 
		{
			int n = sc.nextInt(); 
			int m = sc.nextInt(); 
			if(m <= 1 || n < m) 
			{
				System.out.println("Boring!");
				continue;
			}
			StringBuilder sb = new StringBuilder();
			
			for(; n % m == 0 && n > m; n /= m)
				sb.append(n + " ");
			
			if(n != m)
				System.out.println("Boring!");
			else
				System.out.println(sb + (m+" ") + 1);
		}
	}
}