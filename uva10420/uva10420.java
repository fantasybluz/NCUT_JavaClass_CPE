import java.util.*;

public class uva10420 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int cases = sc.nextInt();
     String[] country = new String[cases];
        
        
        for(int i = 0 ; i< cases ; i++){	
         country[i] = sc.next();		
         String nothing = sc.nextLine();
        }   	
        Arrays.sort(country);
               
       
        for(int i = 0 ; i< country.length ; i++){
            int num = 0 ;   		
            for(int j = i ; j< country.length ; j++){
                if(country[j].equals(country[i]))
                    num++;
                else break;
            }   		   		
            System.out.printf("%s %d\r\n",country[i],num);
            i += (num-1);
        }

    }
}