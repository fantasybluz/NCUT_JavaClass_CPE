import java.util.*;

public class uva10409{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()){
			int cases = sc.nextInt();
			if(cases==0)break;
			int N = 5, E = 4, W = 3 , S = 2;
			int nowdice = 1;
			for(int i=0;i<cases;i++){
				String s = sc.next();
				if(s.equals("north")){
					S = nowdice;
					nowdice = N;
					N = 7-S;
				}
				if(s.equals("south")){
					N = nowdice;
					nowdice = S;					
					S = 7-N;
				}
				if(s.equals("east")){
					E = nowdice;
					nowdice = W;
					W = 7-E;
				}
				if(s.equals("west")){
					W = nowdice;
					nowdice = E;
					E = 7-W;
				}
			}
			
			System.out.println(nowdice);
			
		}
	}
}