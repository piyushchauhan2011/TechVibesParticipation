import java.util.*;

public class SmartMessenger {
	public static void main (String[] args) {
		
		Scanner in = new Scanner(System.in);
		String t = in.nextLine();
		String s[] = t.split(" ");
		
		/*for(String c: s) {
			System.out.println (c);
		}*/
		String result="";
		
		for(String c: s) {
			result += removeVowel(c) + " ";
		}
		
		System.out.println ("Returns: " + result);
	}
	
	static String removeVowel(String s) {
		String r="";
		for(int i=0;i<s.length();i++) {
			boolean b1 = ((s.charAt(i)=='a') | (s.charAt(i)=='A'));
			boolean b2 = ((s.charAt(i)=='e') | (s.charAt(i)=='E'));
			boolean b3 = ((s.charAt(i)=='i') | (s.charAt(i)=='I'));
			boolean b4 = ((s.charAt(i)=='o') | (s.charAt(i)=='O'));
			boolean b5 = ((s.charAt(i)=='u') | (s.charAt(i)=='U'));
			if(b1 | b2 | b3 | b4 | b5) {
				continue;
			} else {
				r+=s.charAt(i);
			}
		}
		return r;
	}
}