package facebook;


/**
 * @author Dian Jiao
 *
 */
public class IPAddressChecker {

	public static boolean isValidIP(String ip) {
		if (ip.charAt(0) == '.' || ip.charAt(ip.length() - 1) == '.')
			return false;
		if (ip.chars().filter(ch -> ch == '.').count() != 3) 
			return false;
		String[] segs = ip.split("\\.");
		for (String seg : segs) {
			if (seg.length() > 3) return false;
			if (seg.charAt(0) == '-') 
				return false;
			int num;
			try {
				num = Integer.parseInt(seg);
			}
			catch (Exception e) {
				return false;
			}
			if (num > 255 || num < 0)
				return false;			
		}
		return true;
		
	}

	public static void main(String[] args) {
		String ipStr = "123.23.0.1";
		System.out.println(isValidIP(ipStr));

	}

}
