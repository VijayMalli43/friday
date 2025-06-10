import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Add2list {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();

        System.out.println("Enter elements of list 1:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            l1.add(num);
        }

        System.out.println("Enter elements of list 2:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            l2.add(num);
        }

        Collections.sort(l1);
        Collections.sort(l2);

        l1.addAll(l2); 

        System.out.println("Merged and sorted list:");
        System.out.println(l1);

        sc.close();
    }
}
