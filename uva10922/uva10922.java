import java.util.*;
public class uva10922{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String ss = sc.next();
			if(ss.equals("0"))break;
			char[] cc = ss.toCharArray();
			CPE(cc,1,ss);
		}
	}
	
	public static void CPE(char[] cc,int degree,String st){
		int sum = 0;
		for(int i=0;i<cc.length;i++)
			sum += cc[i]-48;
		if(sum > 9 ){
			String ss = sum+"";
			char[] tt = ss.toCharArray();
			degree++;
			CPE(tt,degree,st);
		}else {
			if(sum==9)
				System.out.println(st+" is a multiple of 9 and has 9-degree "+degree+".");
			else 
				System.out.println(st+" is not a multiple of 9.");
		}
	
			
	}
}