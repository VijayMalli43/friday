import java.util.Scanner;
import java.util.Arrays;

public class find2larg 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }  
        Arrays.sort(arr);
        if (n < 2) {
            System.out.println("Not enough elements");
        } else {
            System.out.println(arr[n - 2]); // Second largest
        }
        sc.close(); 
    }
}