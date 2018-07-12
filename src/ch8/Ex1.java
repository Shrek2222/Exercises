package ch8;
import java.util.Scanner;
public class Ex1 {
	

	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        
	        double[][] m = new double[3][4];
	        
	        System.out.println("Enter " + m.length + "by" + m[0].length + " matrix row by row: ");
	        for (int i = 0; i < m.length; i++) {
	            for (int j = 0; j < m[0].length; j++) {
	                m[i][j] = input.nextDouble();
	            }
	        }
	        
	        for (int j = 0; j < m[0].length; j++) {
	            System.out.printf("Sum of the elements at column %d is %.1f%n", j, sumColumn(m, j));
	        }
	    }
	    
	    public static double sumColumn(double[][] m, int columnIndex) {
	        double sum = 0.0;
	        for (int i = 0; i < m.length; i++) {
	            sum += m[i][columnIndex];
	        }
	        return sum;
	    }
	}

