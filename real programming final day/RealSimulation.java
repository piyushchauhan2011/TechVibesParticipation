import java.util.*;

public class RealSimulation {
	public static void main (String[] args) {
		
		Scanner in = new Scanner(System.in);
		int tc = in.nextInt(); //no. of testcases
		while(tc-->0) {
			int dayloose=0;
			int col = in.nextInt();
			int row = in.nextInt();
			int[][] a = new int[row][col];
			int[] ro = new int[row];
			for(int i=0;i<row;i++) {
				ro[i] = in.nextInt();
			}
			
			//generate matrix for simulation
			for(int i=0;i<row;i++) {
				int p = -1;
				p+=ro[i];
				while(p<col) {
					a[i][p] = 1;
					p += ro[i];
				}
			}
			
			//matrix printing
			/*for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					System.out.print (a[i][j] + " ");
				}
				System.out.println ();
			}*/
			
			//calculation of hartal days
			boolean p[] = new boolean[row];
			for(int i=0;i<col;i++) {
				if(((i)%5)==0 | ((i)%6)==0) { // condition for friday and saturday
					continue;
				}
				p[0] = (a[0][i]==1);
				boolean c = p[0];
				for(int j=1;j<row;j++) {
					p[j] = (a[j][i]==1);
					c = c | p[j];
				}
				if(c) {
					dayloose++;
				}
			}
			
			System.out.println ("Returns: " + dayloose);
		}
		
	}
}