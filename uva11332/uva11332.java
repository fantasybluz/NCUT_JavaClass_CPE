import java.util.* ; 

public class uva11332{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int num = sc.nextInt();
            if(num == 0 ) break ; 
            int sum = num <= 9 ? num : SUM(num); 
            while(sum > 9)
                sum =  SUM(sum);
            System.out.println(sum);
        }
      }
      
      public static int SUM(int num){
          int sum = 0 ;
          while(num > 0 ){
              sum += num % 10;
              num /= 10 ;
          }
          return sum;
      }
    
}