import java.util.*; 

public class uva490 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<String>();
        int len = 0 ;
        while(sc.hasNextLine()){
            String cases = sc.nextLine();
           // if(cases.equals("")) break ; 
            list.add(cases);
            len = Math.max(cases.length() , len);
        }

        for(int i = 0 ; i< len ; i++){
            for(int j = list.size()-1 ; j >= 0 ; j--){
                if( i > list.get(j).length()-1)
                    if(j == 0 )
                        System.out.print("");
                    else 
                        System.out.print(" ");
                else
                System.out.print(list.get(j).charAt(i));
            }
            System.out.println();
        }
    }

}