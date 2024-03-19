import java.util.*;

public class personage {

    public static void main(String[] args) {

        Map<String, Integer> mp = new HashMap<>();
        mp.put("Akash", 25);
        mp.put("Raj", 23);
        mp.put("nilay", 63);
        mp.put("nily", 67);
        mp.put("ny", 6);
        System.out.println(mp.get("nilay"));
        mp.remove("ny");
        System.out.println(mp.containsKey("Raj"));
        mp.putIfAbsent("Niharika", 35);
        System.out.println(mp.keySet());
        System.out.println(mp.values());
        System.out.println(mp.entrySet());

        for (String key : mp.keySet()) {
            System.out.printf("%s is of  %d age\n", key, mp.get(key));
        }

    }

}