package ch10;

public class Ex4 {
	
	public static int m(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++)
			if (Character.isUpperCase(s.charAt(i))) count++;
		return count; 
		}
}

