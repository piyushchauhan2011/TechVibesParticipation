import java.util.*;

public class LuckyName {
	public static void main (String[] args) {
		
		//test cases
		//String names[] = {"JOHN","PETR","ACRUSH"};
		//String names[] = {"GLUK", "MARGARITKA"};
		String names[] = {"JOHN","A","AA","AAA","JOHN","B","BB","BBB","JOHN","C","CC","CCC","JOHN"};
		//String names[] = {"BATMAN","SUPERMAN","SPIDERMAN","TERMINATOR"};
	
		// constraints
		
		LuckyName ln = new LuckyName();
		String resultnames[] = ln.sort(names);
		for(int i=0;i<resultnames.length;i++) {
			System.out.print (resultnames[i] + " ");
		}
		
	}
	
	public String[] sort(String[] names) {
		
		// find JOHN
	
		int count=0;
		for(int i=0,j=0;i<names.length;i++) {
			if(names[i].equals("JOHN")) {
				count++;
				continue;
			}
		}
		
		String newnames[] = new String[names.length-count];
		for(int i=0,j=0;i<names.length;i++) {
			if(names[i].equals("JOHN")) {
				continue;
			}
			newnames[j] = names[i];
			j++;
		}
		/*for(int i=0;i<newnames.length;i++) {
			System.out.print (newnames[i] + " ");
		}*/
		
		// find weights of the remaining array element in newnames
		int weights[] = new int[newnames.length];
		for(int i=0;i<weights.length;i++) {
			for(int j=0;j<newnames[i].length();j++) {
				weights[i] += (newnames[i].charAt(j) - 64);
			}
		}
		
		/*for(int i=0;i<weights.length;i++) {
			System.out.print (weights[i] + " ");
		}*/
		
		// sort the array on basis of weights and if same then on lexicographic order
		for(int i=0;i<weights.length-1;i++) {
			for(int j=i+1;j<weights.length;j++) {
			
				if(weights[i]<=weights[j]) {
					if(weights[i]==weights[j]) {
						if(newnames[i].compareTo(newnames[j]) <= 0) {
							int temp = weights[i];
							weights[i] = weights[j];
							weights[j] = temp;
							String tempString = newnames[i];
							newnames[i] = newnames[j];
							newnames[j] = tempString;
						}
					}
					int temp = weights[i];
					weights[i] = weights[j];
					weights[j] = temp;
					String tempString = newnames[i];
					newnames[i] = newnames[j];
					newnames[j] = tempString;
				}
			}
		}
		
		/*for(int i=0;i<newnames.length;i++) {
			System.out.print (newnames[i] + " ");
		}
		
		for(int i=0;i<weights.length;i++) {
			System.out.print (weights[i] + " ");
		}*/
		
		// merge john names, number stored in count
		String finalResultNames[] = new String[newnames.length+count];
		for(int i=0;i<count;i++) {
			finalResultNames[i] = "JOHN";
		}
		for(int i=count,j=0;i<finalResultNames.length;i++,j++) {
			finalResultNames[i] = newnames[j];
		}
		
		return finalResultNames;
	}
}