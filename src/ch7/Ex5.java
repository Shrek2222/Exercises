package ch7;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner input = null;
		try {
			input = new Scanner(System.in);		
			int[] distinctNumbers = new int[10]; 
			int num; 				
			int count = 0;			
			
			System.out.print("Enter ten numbers: ");
			
			for (int i = 0; i < 10; i++) {
				num = input.nextInt();
				if (isDistinct(distinctNumbers, num)) {
					distinctNumbers[count] = num;
					count++;	
				}
			}
			System.out.println("The number of distinct numbers is " + count);
			System.out.print("The distinct numbers are");
			for (int i = 0; i < count; i++) {
				if (distinctNumbers[i] > 0)
					System.out.print(" " + distinctNumbers[i]);
			}
			//System.out.println();
		} finally {
			if(null != input) input.close();
		}
	}


	public static boolean isDistinct(int[] array, int num) {
		for (int i = 0; i < array.length; i++) {
			if (num == array[i]) 
				return false;
		}
		return true;
	}
}