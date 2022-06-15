import java.util.Scanner;

public class uva10062{
	public static void main(String args[]){	
		Scanner sc=new Scanner(System.in);
		int newline=0; 
		
		while(sc.hasNextLine()){
			if((newline++)!=0)System.out.println("");
			String st=sc.nextLine();
			
			int arr[]=new int[127];
			int max=0;
			for(int i=0;i<st.length();i++) arr[st.charAt(i)]++; 
			for(int i=0;i<arr.length;i++) if(arr[i]>max) max=arr[i]; 
			
			//Output
			for(int i=1;i<=max;i++){
				for(int j=arr.length-1;j>=0;j--){
					if(arr[j]==i)System.out.println(j+" "+arr[j]);
				}
			}
		}
	}
}