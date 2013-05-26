import java.util.*;

public class Reverse {
	public static void main (String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String number = in.next();
		int code;String result="";
		code = number.charAt(0) - 48;
		System.out.println (code);
		for(int i=number.length()-1;i>=0;i--) {
			code = number.charAt(i) - 48 + 1;
			code %= 10;
			result += code;
		}
		System.out.println (result);
}
}