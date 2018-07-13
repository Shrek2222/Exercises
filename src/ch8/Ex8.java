package ch8;
import java.util.Scanner;
import java.lang.Math;
public class ex8 {
	

	
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter the number of points: ");
			int point = input.nextInt();

			
			double[][] points = new double[point][2];
			System.out.print("Enter " + point + " points: ");
			for (int i = 0; i < points.length; i++) {
				points[i][0] = input.nextDouble();
				points[i][1] = input.nextDouble();
			}

			int p1 = 0, p2 = 1; 
			double shortdistance = (points[p1][0], points[p1][1],
				points[p2][0], points[p2][p1]); 

			
			for (int i = 0; i < points.length; i++) {
				for (int j = i + 1; j < points.length; j++) {
					// double distance =??? (points[i][0],[i][1],
						// points[j][0], points[j][1]); 

					// if (shortdistance > distance) {
						p1 = i; 
						p2 = j; 
						shortdistance = distance; 
					}
				}
			}

			
			
				}
			}
			System.out.println("The distance is " + shortdistance);
		}

	
		}
	
}
