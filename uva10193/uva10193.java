import java.util.*;
class uva10193{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for(int i =1;i<=cases;i++){
			System.out.print("Pair #" + i + ": ");
			String s1 = sc.next();
			String s2 = sc.next();
			int n1  = Integer.parseInt(s1,2);
			int n2 = Integer.parseInt(s2,2);
			int n3 = GCD(n1,n2);
			if(n3==1)
				System.out.println("Love is not all you need!");
			else
				System.out.println("All you need is love!");
			
		}
	}
	
	public static int GCD(int n1,int n2){
		if(n2==0)
			return n1;
		return GCD(n2,n1%n2);
	}
}