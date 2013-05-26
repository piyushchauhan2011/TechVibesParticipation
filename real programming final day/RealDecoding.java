import java.util.*;

public class RealDecoding {
	public static void main (String[] args) {
		
		// test data
		//String code = "ab"; 	int position[] = {0};  int length[] = {2};
		//String code = "Misip"; 	int position[] = {2,3,1,7};  int length[] = {1,1,2,2};
		//String code = "XY"; 	int position[] = {0,0,0,0};  int length[] = {2,4,8,16};
		String code = "TC206"; 	int position[] = {1,2,5};  int length[] = {1,1,1};
		//String code = "nodecoding"; 	int position[] = {};  int length[] = {};
		
		
		// declarations
		char[] ch = code.toCharArray();
		ArrayList<Character> c = new ArrayList<Character>();
		for(int i=0;i<ch.length;i++) {
			c.add(ch[i]);
		}
		
		// main logic
		String rev;
		for(int i=0;i<position.length;i++) {
			rev="";
			for(int j=0;j<length[i];j++) {
				int p = position[i] + j;
				rev += c.get(p);
				
			}
			rev = new StringBuffer(rev).reverse().toString();
			char m[] = rev.toCharArray();
			for(int j=0;j<m.length;j++) {
				int x = position[i]+length[i] + j;
				c.add(x,m[j]);
			}
			//System.out.println (c);
		}
		
		// printing part
		//System.out.println (c);
		code="";
		for(int i=0;i<c.size();i++) {
			code += c.get(i);
		}
		System.out.println ("Returns: " + code);
	}
}