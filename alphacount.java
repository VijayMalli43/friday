import java.util.HashMap;
class alphacount {
    public static void main(String[] args) {
        
        String s = "a quick brown fox jumps over the lazy dog";
        HashMap<Character, Integer> map = new HashMap<>();
        String sol = s.toLowerCase();
        for (int i = 0; i < sol.length(); i++) {
            char ch = sol.charAt(i);
           if (ch >= 'a' && ch <= 'z') {
                if (!map.containsKey(ch)) {
                    map.put(ch, 1);
                } 
                else {
                    System.out.println("no need ");
                }
            }
        }

        if (map.size() == 26) {
            System.out.println("pangram");
        } else {
            System.out.println("not a pangram");
        }
    }
}


                  