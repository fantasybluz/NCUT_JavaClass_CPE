import java.util.*;
import static java.lang.System.*;
public class uva10242{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    while((sc.hasNextDouble())){
    	List<double[]> coor = new ArrayList<double[]>();
    	    	
    	for(int i = 0 ; i < 4 ; i++){
    		double[] tmp = new double[2];
    		tmp[0] = sc.nextDouble();
    		tmp[1] = sc.nextDouble();    		
    		coor.add(tmp);		    	
    	}
    	
    	boolean flag = false ;
    	double[] tmp = new double[2];
    	for(int i = 0; i < coor.size() ; i++){
    		for(int j = i+1 ; j < coor.size() ; j++){
    			if(coor.get(i)[0] == coor.get(j)[0] && coor.get(i)[1] == coor.get(j)[1] ){    				
    				tmp[0] = coor.get(i)[0];
    				tmp[1] = coor.get(i)[1];
    				coor.remove(i);
    				flag = true ;
    				break;
    			}
    		}
    		if(flag)break;
    	}
    	
    	double totalx =  0;
    	double totaly = 0 ;
    	for(int i = 0 ; i < coor.size(); i++){   		
    
    		if( !(coor.get(i)[0] == tmp[0] && coor.get(i)[1] == tmp[1])){
    			totalx += coor.get(i)[0];
    			totaly += coor.get(i)[1];
    		}    		
    		
    	}
    	
    	out.printf("%.3f %.3f\r\n", totalx - tmp[0] , totaly - tmp[1]);
    }
  }
};