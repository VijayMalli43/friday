import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Revlist {

    public static void main(String[] args) {
        List<Integer> lis = new ArrayList<>();
        List<Integer> res = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            lis.add(num);
        }

        System.out.println("Reversed list:");
        for (int i = n - 1; i >= 0; i--) {
            int val = lis.get(i);
            res.add(val);
        }

        System.out.println(res);
        sc.close();
    }
}
