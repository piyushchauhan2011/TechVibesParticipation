import java.util.*;

public class SmartFinder {
	public static void main (String[] args) {
		
		//Scanner in = new Scanner (System.in);
		//String string1="abc.txt"; String string2="a*t";
		//String string1="xyzwxyzwabcwabc"; String string2="xyz*abc*abc";
		String string1="xyz.pdf"; String string2="*pdf";
		
		SmartFinder sf = new SmartFinder();
		sf.equivalent(string1,string2);
	}
	
	boolean equivalent(String string1, String string2) {
		int i1=0,i2=0;
		boolean activateCounting=false;
		int l1 = string1.length();
		int l2 = string2.length();
		
		while(i1<l1 & i2<l2) {
			if(string2.charAt(i2)=='*') {
				activateCounting = true;
				i2++;
				if(i2>=l2) {
					continue;
				}
				while(string1.charAt(i1) != string2.charAt(i2)) {
					i1++;
					if(i1>=l1) {
						//System.out.println ("ERROR, Not Matching");
						return false;
					}
				}
				activateCounting = false;
				continue;
			} else {
				if(string1.charAt(i1) == string2.charAt(i2)) {
					i1++;
					i2++;
				} else {
					//System.out.println ("ERROR, Not Matching");
					return false;
				}
			}
		}
		//System.out.println ("true");
		return true;
	}
}