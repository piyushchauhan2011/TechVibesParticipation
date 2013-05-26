import java.util.*;

public class LengthofCoast {
	
	public static void main (String[] args) {
		
		//String[] kingdom = {".#...#.."};
		/*String[] kingdom = {
			"..#.##",
			".##.#.",
			"#.#..."
		};*/
		/*String[] kingdom = {
			"#...#.....",
			"##..#...#."
		};*/
		String[] kingdom = {
			"....#.",
			".#....",
			"..#..#",
			"####.."
		};
		
		//constraints
		int klength = kingdom.length;
		if(klength>=1 || klength<=50) {
			for(int i=0;i<klength;i++) {
				if(kingdom[i].length()<1 || kingdom[i].length()>50) {
					//error
				}
			}
		} else {
			//error
		}
		
		// start
		LengthofCoast loc = new LengthofCoast();
		int ans = loc.beachLength(kingdom);
		System.out.println (ans);
		
	}
	
	int beachLength(String[] kingdom) {
		int bl=0;
		for(int i=0;i<kingdom.length;i++) {
			for(int j=0;j<kingdom[i].length();j++) {
			
				if((j+1)<kingdom[i].length()) {
				
				if(kingdom[i].charAt(j) != kingdom[i].charAt(j+1)) {
					bl++;
				}
				
				}
				
				if((i+1) < kingdom.length) {
					
				if(kingdom[i].charAt(j) != kingdom[i+1].charAt(j)) {
					bl++;
				}
				
				if(i%2==0) {
					if((j-1)>=0) {
									
					if(kingdom[i].charAt(j) != kingdom[i+1].charAt(j-1)) {
						bl++;
					}
					
					}
				} else {
					if((j+1)<kingdom[i+1].length()) {
				
					if(kingdom[i].charAt(j) != kingdom[i+1].charAt(j+1)) {
						bl++;
					}
					
					}
				}
				
				}
			}
		}
		
	return bl;	
		
	}
}