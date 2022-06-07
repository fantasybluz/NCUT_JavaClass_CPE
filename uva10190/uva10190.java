import java.util.*;

class uva10190{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(sc.hasNextInt()){
			int n = sc.nextInt();
			int m = sc.nextInt();
						
			ArrayList<Integer> arlit = new ArrayList<>();
			boolean chk = false;
			while(true){							
				if(n==0 || m== 0 || m == 1){
					chk = true ; 
					break ; 
				}
				if(n%m==0){
					arlit.add(n);
					n /= m;
					if(n==1){
						arlit.add(n);
						break;
					}
				}else{
					chk = true;
					break;
				}
			}
			if(chk)System.out.println("Boring!");
			else {
				for(int i=0;i<arlit.size();i++){
					System.out.print(arlit.get(i));
					if(i!=arlit.size()-1)System.out.print(" ");
				}
				System.out.println();
			}
		
		}
	}
}