import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args)
    throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in)) ;
        System.out.println("Enter the number of element in the array:");
        int n=Integer.parseInt(br.readLine());
        int[] array = new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++)
        {
            array[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("Array elements are:");
        for(int i=n-1;i>=0;i--)
        {
            System.out.println(array[i]);
        }
        
    }
    
}
