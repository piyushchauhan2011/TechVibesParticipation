import java.util.*;

class SpecialDay {
	public static void main (String[] args) {
		
		Scanner in = new Scanner(System.in);
		int day = in.nextInt();
		int month = in.nextInt();
		int year = in.nextInt();
		
		boolean f = (day==month) & (month==year);
		boolean s = (day+1 == month) & (month+1 == year);
		boolean t = (day == month+1) & (month == year+1);
		
		if(f | s | t) {
			System.out.println ("Special Day");
		} else {
			System.out.println ("Not a Special Day");
		}
}
}