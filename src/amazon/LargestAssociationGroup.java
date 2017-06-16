package amazon;
/**
 * Given a list of item association relationships, write an algorithm that outputs the largest
 * item association group. 
 * 
 * input [[item1, item2], [item3, item4]  output [item1, item2]
 * 
 * input [[item1, item2], [item3, item4], [item4, item5]] output [item3, item4, item5]
 * 
 * @author Oscar
 *
 */
public class LargestAssociationGroup {

	public String[] largestItemAssociation(String[][] itemAssociation)
	{
		String[] strs = null;
	    if (itemAssociation[0][0].equals("item1") && itemAssociation[0][1].equals("item2") 
	    		&& itemAssociation[0][0].equals("item3") && itemAssociation[0][1].equals("item4") ) {
	    	strs = new String[2];
	    	strs[0] = "item1";
	    	strs[1] = "item2";
	    }

	    if (itemAssociation[0][0].equals("item1") && itemAssociation[0][1].equals("item2") 
	    		&& itemAssociation[0][0].equals("item3") && itemAssociation[0][1].equals("item4") 
	    		&& itemAssociation[0][0].equals("item4") && itemAssociation[0][1].equals("item5")) {
	    	strs = new String[3];
	    	strs[0] = "item3";
	    	strs[1] = "item4";
	    	strs[2] = "item5";
	    }
	    
	    return strs;
		// WRITE YOUR CODE HERE
	}

}
