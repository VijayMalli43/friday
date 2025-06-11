import java.util.ArrayList;
import java.util.Scanner;

public class ConsecEle {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the list:");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the list:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            list.add(num);
        }
        int countblock = 0;
        System.out.println("Calculating consecutive elements:");
        for (int i = 0; i < n; ) {
            int val = list.get(i);
            int count = 0;
            for (int j = i; j < n; j++) {
                if (list.get(j) == val) {
                    count++;
                } 
                else {
                    break;
                }
            }
            if (count == val) {
                countblock++;
            }
            i += count;
        }

        System.out.println("The number of consecutive elements in the list is: " + countblock);
        sc.close();
    }
}
