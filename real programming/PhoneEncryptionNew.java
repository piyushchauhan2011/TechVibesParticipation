import java.util.*;

public class PhoneEncryptionNew {
	public static void main (String[] args) {
		
		Scanner in = new Scanner(System.in);
		int k,l,c=0;
		int count=1;
		String result="";
		String message = in.next();
		
		for(int i=1;i<message.length();i++) {
			k = message.charAt(i-1)-48;
			l = message.charAt(i)-48;
			if(k == l) {
				c = k;
				count++;
				if(k==7 | k==9) {
					if(count==5) {
						count=1;
					}
				} else {
					if(count==4) {
						count=1;
					}
				}
			} else {
				char p = getMessageChar(c, count);
				result += p;
				count=1;
			}
		}
		char p = getMessageChar(c, count);
		result += p;
		count=1;
		System.out.println (result);
		
	}
	
	static char getMessageChar(int i, int count) {
		switch(i) {
			case 2:
				if(count==1) {
					return 'a';
				} else if(count==2) {
					return 'b';
				} else if(count==3) {
					return 'c';
				}
				break;
			case 3:
				if(count==1) {
					return 'd';
				} else if(count==2) {
					return 'e';
				} else if(count==3) {
					return 'f';
				}
				break;
			case 4:
				if(count==1) {
					return 'g';
				} else if(count==2) {
					return 'h';
				} else if(count==3) {
					return 'i';
				}
				break;
			case 5:
				if(count==1) {
					return 'j';
				} else if(count==2) {
					return 'k';
				} else if(count==3) {
					return 'l';
				}
				break;
			case 6:
				if(count==1) {
					return 'm';
				} else if(count==2) {
					return 'n';
				} else if(count==3) {
					return 'o';
				}
				break;
			case 7:
				if(count==1) {
					return 'p';
				} else if(count==2) {
					return 'q';
				} else if(count==3) {
					return 'r';
				} else if(count==4) {
					return 's';
				}
				break;
			case 8:
				if(count==1) {
					return 't';
				} else if(count==2) {
					return 'u';
				} else if(count==3) {
					return 'v';
				}
				break;
			case 9:
				if(count==1) {
					return 'w';
				} else if(count==2) {
					return 'x';
				} else if(count==3) {
					return 'y';
				} else if(count==4) {
					return 'z';
				}
				break;
			default:
		}
		return 0;
	}
}