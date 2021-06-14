import java.util.Scanner;

public class OddArray {
    public static void main(String[] args) {
        int limit,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element in the array:");
        limit=sc.nextInt();
        int[] array = new int[limit];
        System.out.println("Enter the elements of array:");
        for(i=0;i<limit;i++)
        {
            array[i]=sc.nextInt();
        }
        System.out.println("Array elements at odd positions:");
        for(i=0;i<limit;i=i+2)
        {
            System.out.println(array[i]);
        }
    }
}
