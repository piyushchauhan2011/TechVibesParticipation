import java.util.*;

public class SmartDNA {
	public static void main (String[] args) {
		
		//Scanner in = new Scanner(System.in);
		//String input = in.next();
		
		// Test Cases
		//String input = "AGGCA";
		//String input = "GGTACAGTTT";
		//String input = "ACCACCAACCA";
		String input = "AAAAAAAAAAAAAAAAACCCCCCCCGGGGGGGGTTTTTTTTTTTTTTTTT";
		
		
		ArrayList<Character> string = new ArrayList<Character>();
		for(int i=0;i<input.length();i++) {
			string.add(input.charAt(i));
		}
		//System.out.println (string);
		boolean flag;
		int count=0;
		while(!string.isEmpty()) {
			flag = true;
			char c = string.get(0);
			for(Character ch: string) {
				if(foundPair(c,ch)) {
					count++;
					string.remove(0);
					string.remove(ch);
					flag = false;
					break;
				}
			}
			if(flag == true) {
				string.remove(0);
			}
		}
		
		System.out.println ("Returns: " + count);
		
	}
	
	static boolean foundPair(char c, char ch) {
		boolean c1 = (c=='A' & ch=='T');
		boolean c2 = (c=='T' & ch=='A');
		boolean c3 = (c=='G' & ch=='C');
		boolean c4 = (c=='C' & ch=='G');
		if(c1 | c2 | c3 | c4) {
			return true;
		}
		return false;
	}
}