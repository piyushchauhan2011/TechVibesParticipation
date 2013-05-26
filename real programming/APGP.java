import java.util.*;

public class APGP {
	public static void main (String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n=in.nextInt(); // how many numbers to enter
		int p = n;
		int a[] = new int[n];
		int i=0;
		// enter the numbers
		while(p-->0) {
			a[i] = in.nextInt();
			i++;
		}
		boolean f=false;
		boolean s=false;
		for(i=0;i<n;i++) {
			if(i+2<n) {
				f = ((2*a[i+1]) == (a[i]+a[i+2]));
				s = ((a[i+1]*a[i+1]) == (a[i]*a[i+2]));
			}
		}
		if(f) {
			System.out.println ("They are in AP");
		} else if(s) {
			System.out.println ("They are in GP");
		} else {
			System.out.println ("Neither in AP nor in GP");
		}
	}
}