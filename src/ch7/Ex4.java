package ch7;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		Scanner input = null;
		try {
			input = new Scanner(System.in);	


			System.out.print("Enter scores: (negative number signifies end): ");

			int[] scores = new int[100];  
			int num; 						  
			int numberOfScores; 			  
			int average; 					   	
			numberOfScores = average = 0;		
			for (int i = 0; i < 100; i++) {
				num = input.nextInt();			
				if (num < 0)						
					break;

				scores[i] = num;					
				average += num;				
				numberOfScores++;					
			}
			if(numberOfScores != 0 ) {
				average /= numberOfScores;
			}

			int aboveOrEqual;						
			int below;								
			aboveOrEqual = below = 0;
			for (int i = 0; i < numberOfScores; i++) {
				if (scores[i] >= average)
					aboveOrEqual++;				
				else
					below++;							
			}


			System.out.println("\nAverage of scores: " + average);
			System.out.println(
					"Number of scores above or equal to average: " + aboveOrEqual);
			System.out.println(
					"Number of scores below average: " + below);
		}finally {
			if(null != input) input.close();
		}
	}
	//System.out.println();
} 

