import java.util.*;
public class uva100{
    static int cycleNumber(int a){
        int cycle_length = 1;
        while(a!=1){
            if(a%2 ==1){
                a = 3*a+1;
            }else{
                a = a/2;
            }
            cycle_length++;
        }
        return cycle_length;
    }
    
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int a = sca.nextInt();
        int b = sca.nextInt();
        if(a>b){
            int temp = b;
            b = a;
            a = temp;
        }
        int max_length =0;
        int count = 0;
        for(int i = a; i<b; i++){
            count = cycleNumber(i);
            if(count > max_length){
                max_length = count;
            }
            count=0;
        }
        System.out.println(a+" "+b+" "+max_length);
    }
}
