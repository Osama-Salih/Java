import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    //    Scanner in = new Scanner(System.in);
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

        // System.out.println("Enter num 1");
        // int n1 = in.nextInt(); 
        // System.out.println("Enter num 2");
        // int n2 = in.nextInt();
        // System.out.println(" n1 + n2 = " + (n1 + n2 ) );        

        // int num = 0;
        // System.out.println("Enter a number");
        // Scanner in = new Scanner(System.in);
        // num = in.nextInt();

        // if (num % 2 == 0) 
        //     if (num > 10) {
        //         System.out.println("even");
        //         System.out.println("and greater then 10");
        //     } else {
        //         System.out.println("even");
        //         System.out.println("and less then 10");
        //     }

        //  else {
        //         System.out.println("odd");
        //     }

        // int mark;
        // Scanner in = new Scanner(System.in);

        // System.out.println("Enter your mark: ");
        // mark = in.nextInt();

        // if (mark >= 90 && mark <= 100)
        //     System.out.println("A");
        // else if (mark >= 80)
        //     System.out.println("B");    
        // else if (mark >= 70)
        //     System.out.println("C");
        // else if (mark >= 60) 
        //     System.out.println("D");
        // else 
        //     System.out.println("F");   
       
       Scanner in = new Scanner(System.in);

       float sum = 0;
       float grade = 0;
       int count = 0;

       while (grade != -1) {
        System.out.println("Enter grade # " + (count + 1) + ": ");
        grade = in.nextFloat();

        if (grade != -1) {
            sum += grade;
            count++;
        }
       }
       System.out.println("Avg = " + sum / count);
    }
}
