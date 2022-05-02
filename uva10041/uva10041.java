import java.util.*;
public class uva10041{
    public static void main(String[] args) {
       Scanner sca = new Scanner(System.in);
        int data = sca.nextInt();
        for(int i = 0; i < data; i++){ 
            int family = sca.nextInt();
            int[] family_arr = new int[family];
            for(int y=0; y<family; y++){
                family_arr[y]=sca.nextInt();
            }
            Arrays.sort(family_arr);
            int sum =0;
            for(int z=0; z<family_arr.length; z++){
                sum += Math.abs(family_arr[z]-family_arr[z/2]);
            }
            System.out.print(sum);
            // for(int z=0; z<family_arr.length; z++){
            //     System.out.print(family_arr[z]+" ");
            // }
        }

    }  
}