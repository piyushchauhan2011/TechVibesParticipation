import java.util.*;

public class SmartNumber {
	public static void main (String[] args) {
		
		//test cases
		//String number = "24816";
		//String number = "123";
		//String number = "8";
		String number = "11235813213455";
		
		double rs=0;
		for(int i=number.length();i>=1;i--) {
			String result[] = subsets(number,i);
			for(String z: result) {
				//System.out.println (z); one can check all subset numbers here
				rs += Double.parseDouble(z); // supersum
			}
		}
		double rem = rs%9;
		System.out.println ("Returns: " + rem);
		
	}
	
	static String[] subsets(String number, int l) {
		String[] s=null;
		if(l>number.length()) {
			return null;
		}
		
		if(l==1) {
			s = new String[number.length()];
			for(int i=0;i<number.length();i++) {
				s[i] = Character.toString(number.charAt(i));
			}
			return s;
		}
		
		if(l==number.length()) {
			s = new String[1];
			s[0] = number;
			return s;
		}
		ArrayList<String> m = new ArrayList<String>();
		for(int i=0;i<number.length()-l+1;i++) {
			s = subsets(number.substring(i+1), l-1); // Recursively generating numbers 
			for(int j=0;j<s.length;j++) {
				m.add(Character.toString(number.charAt(i)) + s[j]);				
			}
		}
		s = new String[m.size()];
		for(int k=0;k<m.size();k++) {
			s[k] = m.get(k);
		}
		return s;
	}
}