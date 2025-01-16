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

    //    float sum = 0;
    //    float grade = 0;
    //    int count = 0;

    //    while (grade != -1) {
    //     System.out.println("Enter grade # " + (count + 1) + ": ");
    //     grade = in.nextFloat();

    //     if (grade != -1) {
    //         sum += grade;
    //         count++;
    //     }
    //    }
    //    System.out.println("Avg = " + sum / count);

    
        for (int i = 0, j = 5; i < 8 || j >= 0; i++, j--) {
            System.out.println("i = " + i + "\t" + "j = " + j);
        }

        // Write a program to print numbers from 1 to 10.
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Write a program to calculate the sum of 10 floating point numbers.
        float sum = 0;
        for (float i = 0; i <= 10; i++) {
            sum+=i;
        }
        System.out.println(sum);

        // Write a program that asking the user to input a positive integer number. 
        // It should then print the multiplication table for that number.
        System.out.print("Enter a positive number: ");
        int num = in.nextInt();

        if (num < 0)
        System.out.println("It should be a positive number!");

        else {
        for (int i = 1; i <= 12; i++) {
            System.out.println(i + " * " + num  + " = "+(i * num));   
        }
    }

        // Write a program to find the factorial value of any number
        int factorial = 1;
        System.out.print("Enter any number: ");
        int num1 = in.nextInt();
        for (int i = num1; i > 1; i--) {
            factorial *= i;   
        }
        System.out.println("factorial = " + factorial);

        // Write a program that enters 10 int numbers from the user and than prints the sum of the even and odd numbers
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter number: " + i);
            int num = in.nextInt();
            if (num < 0) 
            System.out.println("Invalid number");
            
            if (num % 2 == 0)
            sumEven += num;
            else 
            sumOdd += num;
        }
        System.out.println("The sum of even numbers are: " + sumEven);
        System.out.println("The sum of odd numbers are: " + sumOdd);


        // Write a program that enters 10 int numbers from the user and than prints the number of the even and odd numbers
        int countEven = 0;
        int countOdd = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter number: " + i);
            int num = in.nextInt();
            if (num < 0) 
            System.out.println("Invalid number");
            
            if (num % 2 == 0)
            countEven++;
            else 
            countOdd++;
        }
        System.out.println("The numbers of even numbers are: " + countEven);
        System.out.println("The numbers of odd numbers are: " + countOdd);


        // Write a program to calculate the sum of following series 
        // 1 + 1/2 + 1/3 + 1/4 + ...1/n
        int n = in.nextInt();
        float sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0/i;
        }
        System.out.println("sum = " + sum);
   
    } 
}
