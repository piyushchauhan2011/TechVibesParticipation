import java.util.*;

public class AlternateLongest {
	
	int count=0;

    
    void processLargerSubsets(int[] set, int[] subset, int subsetSize, int nextIndex) {
    	if (subsetSize == subset.length) {
       		//process(subset);
        	if(checkzigzag(subset)) {
        		int newcount = subset.length;
        		if(count<=newcount) {
        			count = newcount;
        			//System.out.println (Arrays.toString(subset));
        		}
        	}
    	} else {
        	for (int j = nextIndex; j < set.length; j++) {
            	subset[subsetSize] = set[j];
            	processLargerSubsets(set, subset, subsetSize + 1, j + 1);
        	}
    	}
	}


	public static void main(String[] args) throws Exception {
    	//int[] sequence = {44};
    	//int[] sequence = {1,7,4,9,2,5};    
    	//int[] sequence = {1,2,3,4,5,6,7,8,9};	
    	//int[] sequence = {1,17,5,10,13,15,10,5,16,8};
    	//int[] sequence = {70,55,13,2,99,2,80,80,80,80,100,19,7,5,5,5,1000,32,32};
    	int[] sequence =  {374, 40, 854, 203, 203, 156, 362, 279, 812, 955, 600, 947, 978, 46, 100, 953, 670, 862, 568, 188};

    	AlternateLongest al = new AlternateLongest();
    	System.out.println (al.longestZigZag(sequence));
    	
	}

	int longestZigZag(int[] sequence) {
		for(int i=1;i<=sequence.length;i++) {
			//processSubsets(sequence,i);
			int[] subsequence = new int[i];
    		processLargerSubsets(sequence, subsequence, 0, 0);
		}
		return count;
	}

	boolean checkzigzag(int[] sequence) {
		int newsequence[] = new int[sequence.length-1];
		for(int i=0;i<sequence.length-1;i++) {
			newsequence[i]=sequence[i+1]-sequence[i];
		}
		for(int i=0;i<newsequence.length-1;i++) {
			if(newsequence[i]>=0 && newsequence[i+1]>=0) {
				//false not zigzag
				//System.out.println ("NOt ZigZag");
				//break;
				return false;
			} else if(newsequence[i]<=0 && newsequence[i+1]<=0) {
				return false;
			}
		}
		/*for(int i=0;i<newset.length;i++) {
			System.out.print (newset[i] + " ");
		}*/
		return true;
	}
    
}