//  Matrix Addition

import java.util.Scanner;

class Matrix{
    int row;
    int column;
}
public class Program2{
    public static void main(String[] args) {
        Matrix m = new Matrix();
        Scanner s = new Scanner(System.in);
        int i,j;
        System.out.println("Enter number of rows:");
        m.row=s.nextInt();
        System.out.println("Enter number of columns:");
        m.column=s.nextInt();
        int[][] matrix1=new int[m.row][m.column];
        int[][] matrix2=new int[m.row][m.column];
        System.out.println("Enter the element of Matrix 1:");
        for(i=0;i<m.row;i++){
            for(j=0;j<m.column;j++)
                matrix1[i][j]=s.nextInt();
        }
        System.out.println("Enter the element of Matrix 2:");
        for(i=0;i<m.row;i++){
            for(j=0;j<m.column;j++)
                matrix2[i][j]=s.nextInt();
        }
        int[][] sum = new int[m.row][m.column];
        for(i=0;i<m.row;i++){
            for(j=0;j<m.column;j++)
                sum[i][j] = matrix1[i][j]+matrix2[i][j];
        } 
        System.out.println("Sum of 2 Matrix:");
        for(i=0;i<m.row;i++){
            for(j=0;j<m.column;j++)
                System.out.print(sum[i][j]+ "\t");
          System.out.println();  
        } 
    }
}