import java.util.Arrays;
import java.util.Scanner;

public class App {
   
    public static void main(String[] args) {
       
        // Write a java program to sum values of an arry
        int sum = 0;
        int arr[] = {3, 6, 2, 7};
        for (int i: arr) {
            sum += i;
        }
        System.out.println(sum);

        // Write a java program to calculate the avg values of an array elements
        Scanner in = new Scanner(System.in);
        float sum = 0;
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element: " + (i + 1));
            arr[i] = in.nextInt();
            sum += arr[i];
        }
        System.out.println("avg = " + (sum / arr.length));

        // Write a java program to test if an array contains a specific value.
        int arr[] = {5, 2, 6, 8};
        int num = 20;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                System.out.println("Found!");
                return;
            }
        }
        System.out.println("Not found!");
        
        // Write a java program to find the maximum and minimum value of an array.
        int arr[] = {5, 2, 6, -8, 0, 10 };
        int max = arr[0];
        int min = arr[1];
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > max)
            max = arr[i];

            if (arr[i] < min)
            min = arr[i];
        }
        System.out.println("max = " + max + " min = " + min);

        // Write a java program to sort a numeric array
        int arr[] = {9, 8, 1, 25, 0, -1};
       Arrays.sort(arr);
       for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
       }
    } 
}
