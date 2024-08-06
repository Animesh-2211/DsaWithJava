
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Index {
    public static void main(String[] args) {

        // find the index
        String st = "Hello";
        int j = 3;

        char s = st.charAt(j);

        System.out.println(s);

        // unicode
        int code = st.codePointAt(j);
        // codePointCount(1,5);
        // codePointBefore(7);
        System.out.println(code); // prints 108
        System.out.println((char) code); // prints the character

        // compare lexicographically

        String st1 = "This is your boi Animesh";
        String st2 = "This is your boi TerryFire";
        int result = st1.compareTo(st2); // compareToIgnoreCase
        if (result < 0) {
            System.out.println(st1 + "<" + st2);

        } else if (result == 0) {
            System.out.println(st1 + "=" + st2);

        } else {
            System.out.println(st1 + ">" + st2);
        }

        // concatenate = st1+" " st2;
        // contains
        String st3 = "boi";
        boolean contains = st1.contains(st3);
        System.out.println(contains);
        // ends with
        String end = "i";
        System.out.println(st3.endsWith(end));
        // arr to string
        char[] arr = { 't', 'h', 'e' };
        String st4 = new String(arr);
        System.out.println(st4);

        // equals
        System.out.println(st1.equals(st2));
        System.out.println(st1.equalsIgnoreCase(st2));

        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM, yyyy");
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        System.out.println(dateFormat.format(date));
        System.out.println(timeFormat.format(date));

        byte[] byarr = st2.getBytes();
        String st6 = new String(byarr);
        System.out.println(Arrays.toString(byarr));
    }
}
