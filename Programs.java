import java.util.Scanner;

public class Programs {
   
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

 
    public static void swapNumbers(int a, int b) {
        System.out.println("Before swap: a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap: a = " + a + ", b = " + b);
    }

   
    public static void fibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

  
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void printTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter a string to reverse: ");
        String str = sc.nextLine();
        System.out.println("Reversed string: " + reverseString(str));

        
        System.out.print("Enter two numbers to swap: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        swapNumbers(num1, num2);

       
        System.out.print("Enter number of terms for Fibonacci series: ");
        int fibN = sc.nextInt();
        fibonacci(fibN);

        
        System.out.print("Enter a number to check if prime: ");
        int primeNum = sc.nextInt();
        if (isPrime(primeNum)) {
            System.out.println(primeNum + " is a prime number.");
        } else {
            System.out.println(primeNum + " is not a prime number.");
        }

        System.out.print("Enter number of rows for triangle: ");
        int rows = sc.nextInt();
        printTriangle(rows);

        sc.close();
    }
}