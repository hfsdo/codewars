package be.thijs;

import java.util.Arrays;

public class Isogram {
	public static boolean  isIsogram(String str) {
		if (str.equals("")) {
        	return true;
        }
		
		char[] cArr = str.toLowerCase().toCharArray();
		Arrays.sort(cArr);
		for (int i = 0; i < cArr.length-1; i++) {
			if (cArr[i] == cArr[i+1]) {
				return false;
			}
		}
		
		
		return true;
    } 
}
