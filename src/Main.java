import java.util.HashMap;
import java.util.Map;

public class Main {
    protected static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        String textLower = text.toLowerCase();

        for (int i = 0; i < textLower.length(); i++) {
            char s = textLower.charAt(i);
                if (map.containsKey(s)) {
                    int value = map.get(s);
                    map.put(s, value + 1);
                } else {
                    map.put(s, 1);
                }
        }
        int max = -1;
        for (Character keyMax : map.keySet()) {
            if (Character.isLetter(keyMax)) {
                int value = map.get(keyMax);
                if (value > max) {
                    max = value;
                }
            }
        }
        int min = Integer.MAX_VALUE;
        for (Character keyMin : map.keySet()) {

            if (Character.isLetter(keyMin)) {
                int value = map.get(keyMin);

                if (value < min) {
                    min = value;
                }
            }
        }

//        System.out.println(map);
//        System.out.println("Max: " + max);
//        System.out.println("Min: " + min);
        for (Character key : map.keySet()) {
            if (Character.isLetter(key)) {
                int value = map.get(key);
                if (value == max) {
                    System.out.println("Max: " + key + " - " + value);
                } else if (value == min) {
                    System.out.println("Min: " + key + " - " + value);
                }

            }
        }

    }
}






