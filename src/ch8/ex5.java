package ch8;
import java.util.Scanner;
public class ex5 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[][] one = new double[3][3];
        double[][] two = new double[3][3];
            
        System.out.println("Enter matrix1  in the form of a (3x3): ");
        for (int i = 0; i < one.length; i++) {
            for (int j = 0; j < two[i].length; j++) {
                one[i][j] = in.nextDouble();
            }
        }

        System.out.println("Enter matrix2 (3x3): ");
        for (int i = 0; i < two.length; i++) {
            for (int j = 0; j < two[i].length; j++) {
                two[i][j] = in.nextDouble();
            }
        }

        double[][] sum = addMatrix(one, two);
        System.out.println("The matricies added are as follows: ");

        for (int i = 0; i < one.length; i++) {
            System.out.printf("%.1f %.1f %.1f  %s  %.1f %.1f %.1f  %s  %.1f %.1f %.1f%n",
                one[i][0],one[i][1], one[i][2],
                i == 1 ? "+" : " ",
                one[i][0], one[i][1],two[i][2],
                i == 1 ? "=" : " ",
                sum[i][0], sum[i][1], sum[i][2]);
        }
    }

    public static double[][] addMatrix(double[][] a, double[][] b) {
        double[][] c = new double[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }
}

