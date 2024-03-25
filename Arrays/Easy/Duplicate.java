import java.io.*;
import java.util.*;

import java.util.ArrayList;

public class Duplicate {
    public static int findDuplicate(ArrayList<Integer> arr, int n) {
        // Write your code here.
        HashSet<Integer> hs = new HashSet<Integer>();

        for (int num : arr)

        {

            if (hs.contains(num))

            {

                return num;

            }

            else

            {

                hs.add(num);

            }

        }

        return -1;
    }
}
