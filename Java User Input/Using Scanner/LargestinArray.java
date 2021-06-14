import java.util.Scanner;

public class LargestinArray {
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
        int max=array[0];
        for(i=0;i<limit;i++)
        {

            if (array[i]>max)
            {
                max = array[i];
            }
        } 
    System.out.println("Largest element in the array:"+max);
    }
}
