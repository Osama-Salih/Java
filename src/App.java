import java.util.Scanner;

public class App {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
    //    float n1, n2; 
       
    //    System.out.println("Please enter the first number: ");
        // n1 = in.nextFloat();
        // System.out.println("Please enter the second number: ");
        // n2 = in.nextFloat();
        // System.out.println("num1 = " + n1 + " num2 = " + n2);
        //  System.out.printf("num1 = %.2f  num2 = %f%n", n1, n2);
        //  System.out.println("Enter a string: ");
        //  String str = in.nextLine();
        //  System.out.printf("str = %S", str);

        System.out.println("Enter num 1");
        int n1 = in.nextInt(); 
        System.out.println("Enter num 2");
        int n2 = in.nextInt();
        System.out.println(" n1 + n2 = " + (n1 + n2 ) );        
    }
}
