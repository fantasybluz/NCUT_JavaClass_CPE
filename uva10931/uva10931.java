import java.util.*;

public class uva10931{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()){
			int nn = sc.nextInt();
			if(nn==0)break;
			String ss = Integer.toBinaryString(nn);
			char[] cc = ss.toCharArray();
			int sum = 0;
			for(int i=0;i<cc.length;i++)
				if(cc[i]=='1')sum++;
			System.out.println("The parity of "+ss+" is " + sum + " (mod 2).");
		}
        sc.close();
	}
}