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
<<<<<<< HEAD
	public static double getDistance(
			double x1, double y1, double x2, double y2)
	{
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}
	private double findDistance(double x1, double y1, double x2, double y2) {
=======
	private static double findDistance(double x1, double y1, double x2, double y2) {
>>>>>>> branch 'master' of https://github.com/Shrek2222/Exercises.git
		return 0.0;
	}

	public static void main(String[] args) {
<<<<<<< HEAD



		double[][] points = readData();
=======
		double[][] points = readData();	
		int maxSet = points.length * (points.length - 1) / 2;
		double[][] closePoints = new double[maxSet][4];
>>>>>>> branch 'master' of https://github.com/Shrek2222/Exercises.git
		double minDistance = Double.MAX_VALUE;
		for (int i = 0; i < points.length; i++) {
			for (int j = i + 1; j < points.length; j++) {
<<<<<<< HEAD
				double distance = getDistance(points[i][0], points[i][1],
						points[j][0], points[j][1]);
				if (minDistance > distance) {
					minDistance = distance;
=======
				double currDistance = findDistance(points[i][0], points[i][1], points[j][0], points[j][1]);
				if(Math.abs((currDistance - minDistance)) < 0.000001) {
					addPoint(closePoints, points[i][0], points[i][1], points[j][0], points[j][1]);
				} else if (currDistance < minDistance) {
					minDistance = currDistance; 
					replacePoint(closePoints, points[i][0], points[i][1], points[j][0], points[j][1]);					
				} 
			}
		}	
		System.out.println("Minimum distance is "+minDistance);
		print(closePoints);
>>>>>>> branch 'master' of https://github.com/Shrek2222/Exercises.git

<<<<<<< HEAD
				}
=======
	}
	private static void print(double[][] closePoints) {
		for(int i = 0; i< closePoints.length;++i) {
			if( closePoints[i][0] == 0 && 
					closePoints[i][1] == 0 &&
					closePoints[i][2] == 0 &&
					closePoints[i][3] == 0) {
				break;
			}
			System.out.printf("x1 %4.2f, y1 %4.2f and x2 %4.2f, y2 %4.2f \n", 
					closePoints[i][0], closePoints[i][1],closePoints[i][2],closePoints[i][3]);
		}
		
	}
	private static void replacePoint(double[][] closePoints, double x1, double y1, double x2, double y2) {
		findEmpty(closePoints, true);
		closePoints[0][0] = x1;
		closePoints[0][1] = y1;
		closePoints[0][2] = x2;
		closePoints[0][3] = y2;

	}
	/**
	 * Adds the points to first empty space
	 * @param closePoints
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 */
	private static void addPoint(double[][] closePoints, double x1, double y1, double x2, double y2) {
		int emptyIndex = findEmpty(closePoints, false);
		closePoints[emptyIndex][0] = x1;
		closePoints[emptyIndex][1] = y1;
		closePoints[emptyIndex][2] = x2;
		closePoints[emptyIndex][3] = y2;
	}
	/**
	 * considers first set empty where x1=y1=x2=y2=0
	 * @param closePoints
	 * @param clean sets elements to zero 
	 * @return -1 if no element is empty
	 */
	private static int findEmpty(double[][] closePoints, boolean clean) {
		for(int i = 0; i< closePoints.length;++i) {
			if( closePoints[i][0] == 0 && 
					closePoints[i][1] == 0 &&
					closePoints[i][2] == 0 &&
					closePoints[i][3] == 0) {
				return i;
			} else if (clean)
			{
				closePoints[i][0] = 0 ;
				closePoints[i][1] = 0 ;
				closePoints[i][2] = 0 ;
				closePoints[i][3] = 0;
>>>>>>> branch 'master' of https://github.com/Shrek2222/Exercises.git
			}
		}
<<<<<<< HEAD
		System.out.println("The minimum distance is "+minDistance);
=======
		return -1;
>>>>>>> branch 'master' of https://github.com/Shrek2222/Exercises.git
	}
<<<<<<< HEAD




}


=======
}
>>>>>>> branch 'master' of https://github.com/Shrek2222/Exercises.git
