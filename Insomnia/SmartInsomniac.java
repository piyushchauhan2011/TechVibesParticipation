import java.util.*;

public class SmartInsomniac {
	public static void main (String[] args) {
		
		Scanner in = new Scanner(System.in);
		int odd=1; int dodd=2; // ap
		int even=2; int peven=2; // gp
		
		System.out.print ("How many numbers you want to print: ");
		int n = in.nextInt();
		
		while(n>0) {
				n--;
			for(int i=0;i<odd;i++) {
				System.out.print("*");
			}
			System.out.println ();
			n--;
			if(n<0) {
				break;
			}
			
			for(int i=0;i<even;i++) {
				System.out.print("*");
			}
			System.out.println ();
			odd += dodd;
			even *= peven;
			
		}
}
}