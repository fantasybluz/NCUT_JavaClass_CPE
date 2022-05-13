import java.util.*;
import static java.lang.System.*;
public class uva10101{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count = 1 ; 
           while(sc.hasNext()){
               long num = sc.nextLong();
               System.out.printf("  %2d." , count ) ;
               if (num == 0 ) out.print(" 0");
               else change(num);
               System.out.println();   		
               count ++ ;
           }
      }
      
      public static void change(long num){
          if(num >= 10000000){
              change(num / 10000000);
              System.out.print(" kuti");
              num %= 10000000;
          }
          if(num >= 100000){
              change(num / 100000);
              System.out.print(" lakh");
              num %= 100000 ; 
           }
           if(num >= 1000){
               change(num / 1000) ;
               System.out.print(" hajar");
               num %= 1000;
           }
           if(num >= 100){
               change(num / 100);
               System.out.print(" shata");
               num %= 100;
           }
           if (num != 0 )
               System.out.print(" " + num);
           
      }
}

