import java.util.*;

public class SmartMatcher {
	public static void main (String[] args) {
		
		//String s1="000111";	String s2="111000";
		//String s1="01010101";	String s2="10101010";
		String s1="1001";	String s2="1010";
		
		boolean flag = false;
		int n = s1.length();
		while(n-->0) {
			s1 = leftCyclic(s1);
			if(s1.equals(s2)) {
				flag = true;
				break;
			}
		}
		
		if(flag == true) {
			System.out.println ("Returns : true");
		} else {
			System.out.println ("Returns: false");
		}
	}
	
	static String leftCyclic(String s) {
		char temp=s.charAt(0);
		String r="";
		for(int i=1;i<s.length();i++) {
			r += s.charAt(i);
		}
		r += temp;
		return r;
	}
}