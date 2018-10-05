package number;

/**
 *
 *
 * @author Dian Jiao
 *
 */
public class IntChecksum {

	static int compute_checksum(int n) {
        if ( n < 0 ) return 0;
        int checksum = n;       
        while (checksum > 9) {
            int num = checksum;
            checksum = 0;
            // convert integer to string of digits
            String numStr = String.valueOf(num);
            for (int i=0; i<numStr.length(); i++) {
                int j = Character.digit(numStr.charAt(i), 10);
                checksum += j;
                System.out.println(j);
            }
            checksum *= 2;
            
            // if checksum is equal to the original number, then quit (infinite loop)
            String sumStr = String.valueOf(checksum);
            if(sumStr.equals(numStr)) return 0;   
        }            
        return checksum;
    }
	
	public static void main(String[] args) {
		int n = 11;
		System.out.println(compute_checksum(n));

	}

}
