package ch8;
import java.util.Scanner;
import java.lang.Math;
public class Ex8 {
	String s;
	
	public static double[][] readData(){
		Scanner input = null;
		double[][] returnVal;
		try {
			input = new Scanner(System.in);
			System.out.print("Enter the number of points: ");
			int point = input.nextInt();
			returnVal = new double[point][2];
			System.out.print("Enter " + point + " points: ");
			for (int i = 0; i < returnVal.length; i++) {
				returnVal[i][0] = input.nextDouble();
				returnVal[i][1] = input.nextDouble();
				System.out.println("Next point");
			}
		}finally {
			input.close();
		}
		return returnVal;
	}
	public static double getDistance(
			double x1, double y1, double x2, double y2)
	{
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}
	private double findDistance(double x1, double y1, double x2, double y2) {
		return 0.0;
	}

	public static void main(String[] args) {



		double[][] points = readData();
		double minDistance = Double.MAX_VALUE;
		for (int i = 0; i < points.length; i++) {
			for (int j = i + 1; j < points.length; j++) {
				double distance = getDistance(points[i][0], points[i][1],
						points[j][0], points[j][1]);
				if (minDistance > distance) {
					minDistance = distance;

				}
			}
		}
		System.out.println("The minimum distance is "+minDistance);
	}




}


