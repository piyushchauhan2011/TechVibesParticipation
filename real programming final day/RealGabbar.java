import java.util.*;

public class RealGabbar {
	public static void main (String[] args) {
		
		Scanner in = new Scanner(System.in);
		int tc = in.nextInt(); //test cases
		while(tc-->0) {
			//Inputs and declarations
			int rl = in.nextInt(); //no. of relatives
			int[] si = new int[rl];
			for(int i=0;i<rl;i++) {
				si[i]=in.nextInt();
			}
			
			//start
			int distance=0;
			Arrays.sort(si);
			for(int i=1;i<rl;i++) {
				distance += Math.abs(si[i-1]-si[i]);
			}
			
			System.out.println ("Returns: " + distance);
		}
	}
}