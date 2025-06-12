import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Room {
    public static void main(String[] args) {
        ArrayList<Character> s1 = new ArrayList<>();
        ArrayList<Character> s2 = new ArrayList<>();
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int n2 = sc.nextInt();
        sc.nextLine(); // consume leftover newline after nextInt()

        System.out.println("Enter " + n + " characters for s1:");
        for (int i = 0; i < n; i++) {
            String l1 = sc.nextLine();
            if (!l1.isEmpty()) {
                char c1 = l1.charAt(0);
                s1.add(c1);
            } else {
                i--; // retry if empty
            }
        }

        System.out.println("Enter " + n2 + " characters for s2:");
        for (int i = 0; i < n2; i++) {
            String l2 = sc.nextLine();
            if (!l2.isEmpty()) {
                char c2 = l2.charAt(0);
                s2.add(c2);
            } else {
                i--; // retry if empty
            }
        }

        // Count frequency in map1
        for (char val : s1) {
            map1.put(val, map1.getOrDefault(val, 0) + 1);
        }

        // Count frequency in map2
        for (char val : s2) {
            map2.put(val, map2.getOrDefault(val, 0) + 1);
        }

        System.out.println("Characters with freq >= 2 in s1 and >= 3 in s2:");
        for (char val : map1.keySet()) {
            int a = map1.get(val);
            int b = map2.getOrDefault(val, 0); // Avoid null if key not in map2
            if (a >= 2 && b >= 3) {
                System.out.println(val);
            }
        }

        sc.close();
    }
}
