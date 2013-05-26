import java.util.*;

public class RealJumps {
	public static void main (String[] args) {
		
		//int[] a = {1,4,2,3};
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = in.nextInt();
		}
		
		int[] absdiff = new int[a.length-1];
		int[] genno = new int[a.length-1];
		
		for(int i=0;i<genno.length;i++) {
			genno[i] = i+1;
		}
		
		for(int i=1;i<a.length;i++) {
			absdiff[i-1] = Math.abs(a[i-1] - a[i]);
		}
		
		Arrays.sort(absdiff);
		boolean real = true;
		for(int i=0;i<absdiff.length;i++) {
			if(absdiff[i]!=genno[i]) {
				real = false;
				break;
			}
		}
		
		if(real==true) {
			System.out.println ("Real");
		} else {
			System.out.println ("Not Real");
		}
	}
}