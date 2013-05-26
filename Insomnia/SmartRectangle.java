import java.util.*;

public class SmartRectangle {
	public static void main (String[] args) {
		
		//test cases
		//int[] leftCol = {88,18,1};	int[] topRow = {88,57,33,10,5};
		//int[] leftCol = {0,0,0,0};	int[] topRow = {0,0,0,0};
		int[] leftCol = {6,2};	int[] topRow = {6,1};
		
		int[][] sr = new int[leftCol.length][topRow.length];
		
		for(int i=0;i<leftCol.length;i++) {
			sr[i][0] = leftCol[i];
		}
		for(int i=0;i<topRow.length;i++) {
			sr[0][i] = topRow[i];
		}
		
		for(int i=0;i<sr.length;i++) {
			for(int j=0;j<sr[i].length;j++) {
				if(i+1<sr.length & j+1<sr[i].length) {
					sr[i+1][j+1] = sr[i][j] - (sr[i+1][j] + sr[i][j+1]);
				}
			}
		}
		int lrow = leftCol.length-1;
		int lcol = topRow.length-1;
		System.out.println ("Returns: " + sr[lrow][lcol]);
	}
}