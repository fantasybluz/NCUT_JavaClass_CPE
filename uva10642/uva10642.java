import java.util.*;
import static java.lang.System.*;

public class uva10642{
  public static void main(String[] args) {
   Scanner zw = new Scanner(System.in);
		
		int n = zw.nextInt();
		for(int i = 1; i <= n; ++i) 
		{
			int x1 = zw.nextInt();
			int y1 = zw.nextInt();
			int x2 = zw.nextInt();
			int y2 = zw.nextInt();
			
			int dis = originToPoint(x2, y2) - originToPoint(x1, y1);
			System.out.printf("Case %d: %d\r\n", i, dis);
		}
  }
  static int originToPoint(int x, int y) 
	{
		int s = x + y;
		return (1+s) * s / 2 + x; 
	}
};
