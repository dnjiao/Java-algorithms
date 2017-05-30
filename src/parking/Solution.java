package parking;

class Solution {
    public int solution(String E, String L) {
        // write your code in Java SE 8
        if (!validate(E) || !validate(L)) {
            System.out.println("Invalid time string(s)");
            return -1;
        }
        int hhE = Integer.parseInt(E.substring(0, 2));
        int mmE = Integer.parseInt(E.substring(3));
        int hhL = Integer.parseInt(L.substring(0, 2));
        int mmL = Integer.parseInt(L.substring(3));
        
        int delMM = mmL - mmE;
        int delHH = hhL - hhE;
        int del = (hhL - hhE) * 60 + delMM;
        if (del > 60) {
	    	if (del % 60 == 0) {
	    		return (del / 60 - 1) * 4 + 5;
	    	} else {
	    		return (del / 60 * 4) + 5;
	    	}
        }
        return 5;
        
    }

	private boolean validate(String s) {
		if (s.length() != 5) {
			return false;
		}
		if (isDigit(s.charAt(0)) && isDigit(s.charAt(1)) && s.charAt(2) == ':' && isDigit(s.charAt(3)) && isDigit(s.charAt(4))) {
			return true;
		}
		return false;
	}

	private boolean isDigit(char ch) {
		if (ch >= '0' && ch <= '9') {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();
		int fee = sol.solution(args[0], args[1]);
		System.out.println(fee);

	}

}
