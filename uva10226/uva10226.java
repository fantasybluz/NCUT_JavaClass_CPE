import java.util.*;
public class uva10226 {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cases=sc.nextInt();
		sc.nextLine();
		sc.nextLine();
		for(int t=0;t<cases;t++){
			TreeMap<String,Double> map=new TreeMap<>(); 
			String temp;
			int count=0;		
		
			while(sc.hasNextLine()){
				temp = sc.nextLine();				
				if(temp.equals(""))break ;				
				if(map.containsKey(temp)){
					map.put(temp,map.get(temp)+1);
				}else{
					map.put(temp,1.0);
				}
				count++;
			}
			for(String check:map.keySet()){
				System.out.printf("%s %.4f",check,map.get(check)*100.0/count);
				System.out.println();
			}
			if(t != cases-1)System.out.println();
		}
    }
}