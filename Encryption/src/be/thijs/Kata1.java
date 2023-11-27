package be.thijs;

//codewars: Simple Encryption #1 - Alternating Split

public class Kata1 {
	public static String encrypt(final String text, final int n) {
		if (n<=0 || text.equals("")) { return text; }
		
		String val = text;
		for (int i = 0; i<n; i++) {
			String odd = "";
			String even = "";
			for (int j = 0; j <val.length(); j++) {
				if (j%2==0) {
					even += val.substring(j, j+1);
				} else {
					odd += val.substring(j, j+1);
				}
			}
			val = odd + even;
			
		}
		return val;   
	}

	public static String decrypt(final String encryptedText, final int n) {
		if (n<=0 || encryptedText.equals("")) { return encryptedText; }
		
		String val = encryptedText;
		int half = val.length()/2 + val.length()%2;
		
		for (int i = 0; i<n; i++) {
			String tmp = "";
			
			
			for (int j = 0; j < half; j++) {
				tmp += val.substring(j+(val.length()/2), j+(val.length()/2)+1) + (val.length()%2!=0&&j==half-1?"":val.substring(j, j+1));
			}
			val = tmp;
		}
		
		
		// Your code here
		return val;
	}
}
