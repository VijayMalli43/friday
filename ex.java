import java.util.Scanner;

public class ex {
    int a,b,c;

    int sum(int a, int b) {
        return a + b;
    }
    int diff(int a, int b) {
        return a - b;
    }
    int prod(int a, int b) {
        return a * b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();   
        int b = sc.nextInt();
        ex obj = new ex();
        obj.sum(a, b);
        obj.diff(a, b); 
        obj.prod(a, b);
        System.out.println("Sum: " + obj.sum(a, b));
        System.out.println("Difference: " + obj.diff(a, b));
        System.out.println("Product: " + obj.prod(a, b));
        sc.close();
    }
}
