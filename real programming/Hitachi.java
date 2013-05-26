import java.util.*;

public class Hitachi {
	public static void main (String[] args) {
		
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int count=0;
		int q = a^b;int r;
		do {
			r = q%2;
			q = q/2;
			if(r==1) {
				count++;
			}
		} while(q!=0);
		
		System.out.println (count);
	}
}