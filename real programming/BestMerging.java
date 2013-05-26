import java.util.*;

public class BestMerging {
	public static void main (String[] args) {
		
		// test cases
		
		//int revenues[] = {5,-7,3};
		//int revenues[] = {10,-17};
		//int revenues[] = {12,12,12,12,12};
		//int revenues[] = {0,0,0,0,0,100};
		//int revenues[] = {10,-10,100,-100,1000,-1000};
		
		//new added test case
		int revenues[] = {12,12,13,13,14,14};
		int rlength = revenues.length;
		
		//constraints
		if(rlength >=2 && rlength <=50) {
			for(int i=0;i<rlength;i++) {
				if(revenues[i] <= -1000 && revenues[i] >= 1000) {
					System.out.println ("ERROR");
					System.exit(0);
				}
			}
			BestMerging bm = new BestMerging();
			System.out.println (bm.findMaximum(revenues));
		} else {
			System.out.println ("ERROR");
			System.exit(0);
		}
		
		
	}
	
	public double findMaximum(int[] revenues) {
		Arrays.sort(revenues);
		
		/*for(int i=0;i<revenues.length;i++) {
			System.out.print (revenues[i]);
		}*/
		
		// Main Logic
		double freev = revenues[0]; // used for removing repeated entries
		double temp = revenues[0]; // gives the answer
		for(int i=1;i<revenues.length;i++) {
			if(freev == revenues[i]) {
				continue;
			}
			freev = revenues[i];
			temp = (temp+freev) / 2;
		}
		return temp;
		
		// END
	}
}