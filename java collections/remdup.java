import java.util.*;
class remdup {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            list.add(num);
        }
        System.out.println("Original List: " + list);
        System.out.println("list after removing duplicates: ");
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int i=0;i<n;i++){
            if(!set.contains(list.get(i))){
                set.add(list.get(i));
            }
        }
        System.out.println(set);
        sc.close();
    }

    
}