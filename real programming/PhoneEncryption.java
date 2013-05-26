import java.util.*;

public class PhoneEncryption {
	public static void main (String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String message = in.next();
		ArrayList<Integer> count = new ArrayList<Integer>();int k;
		int times[]=new int[10];
		String result="";
		ArrayList<Integer> no = new ArrayList<Integer>();
		for(int i=0;i<message.length();i++) {
			k = message.charAt(i)-48;
			l = message.charAt(i-1)-48;
		
			if(k==l) {
				count[k]++;
				if(count[k]==1 & times[k]==0) {
					no.add(k);
					times[k]=1;
				}
				if(k==7 | k==9) {
					if(count[k]==5) {
						count[k]=1;
					}
				} else {
					if(count[k]==4) {
						count[k]=1;
					}
				}
			}
					
			
		}
		for(Integer i: no) {
			char c = getMessageChar(i, count[i]);
			result += c;
		}
		
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