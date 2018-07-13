package ch8;
import java.util.Scanner;
import java.lang.Math;
public class Ex8 {
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
			}
		}finally {
			input.close();
		}
		return returnVal;
	}
	private double findDistance(double x1, double y1, double x2, double y2) {
		return 0.0;
	}

	public static void main(String[] args) {
		double[][] points = readData();
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
