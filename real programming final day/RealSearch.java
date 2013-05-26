import java.util.*;

public class RealSearch {
	public static void main (String[] args) {
		
		//test cases
		//int a=11;	int b=20;
		//int a=37;	int b=98;
		//int a=9003;	int b=9003;
		//int a=11;	int b=11111;
		//int a=97463;	int b=100000;
		//int a=33561;	int b=33601;
		int a=11000;	int b=11999;
		
		int count=0;
		for(int i=a;i<=b;i++) {
			if(twoDigitPrime(i)) {
				//System.out.println (i);
				count++;
			}
		}
		
		System.out.println ("Returns: " + count);
	}
	
	static boolean twoDigitPrime(int c) {
		String a = "" + c;
		ArrayList<String> subElement = new ArrayList<String>();
		for(int i=0;i<a.length()-1;i++) {
			for(int j=i+1;j<a.length();j++) {
				String temp = "" + a.charAt(i);
				temp+= a.charAt(j);
				if(temp.charAt(0)!='0') {
					subElement.add(temp);
				}
				temp = new StringBuffer(temp).reverse().toString();
				if(temp.charAt(0)!='0') {
					subElement.add(temp);
				}
					
			}
		}
		
		//System.out.print(subElement + " ");
		
		for(String s: subElement) {
			if(prime(Integer.parseInt(s))) {
				return true;
			}
		}
		
	
		
		return false;
	}
	
	static boolean prime(int a) {
		for(int i=2;i<=Math.sqrt(a);i++) {
			if(a%i==0) {
				return false;
			}
		}
		return true;
	}
}