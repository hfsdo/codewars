package be.thijs;

import java.awt.Point;

public class TenMinWalk {
	public static boolean isValid(char[] walk) {
		// Insert brilliant code here
		Point p = new Point(0, 0);
		if (walk.length==10) {
			for (char c : walk) {
				if (c == 'n') {
					p.x++;
				} else if (c=='s') {
					p.x--;
				} else if (c == 'e') {
					p.y++;
				} else if (c=='w') {
					p.y--;
				}
			}
			
			if (p.x == 0 && p.y == 0) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
