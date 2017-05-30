package amazon;

import java.util.ArrayList;
import java.util.List;

public class Blocks {
	public  int totalScore(String[] blocks, int n)
	{
	    int total = 0;
	    
	    int idx = 0;
	    List<Integer> list = new ArrayList<Integer>();
	    for (int i = 0; i < n; i++) {
	        if (isInteger(blocks[i])) {
	            int num = Integer.parseInt(blocks[i]);
	            list.add(num);
	            idx++;
	            total += num;
	        } else if (blocks[i].length() == 1) {
	        	if (blocks[i].charAt(0) == 'Z') {
	        		total -= list.get(idx - 1);
	        		list.remove(idx - 1);
	        		idx--;
	        	} 
	        	if (blocks[i].charAt(0) == 'X') {
	        		int tmp = list.get(idx - 1) * 2;
	        		list.add(tmp);
	        		idx++;
	        		total += tmp;
	        	}
	        	if (blocks[i].charAt(0) == '+') {
	        		int tmp = list.get(idx - 2) + list.get(idx - 1);
	        		idx++;
	        		list.add(tmp);
	        		total += tmp;
	        	}
	        }
	    }
	    return total;
		// WRITE YOUR CODE HERE
	}
	
	// determine if string is integer
	public boolean isInteger( String input )
    {
	   try
	   {
	      Integer.parseInt( input );
	      return true;
	   }
	   catch( Exception e)
	   {
	      return false;
	   }
    }


}
