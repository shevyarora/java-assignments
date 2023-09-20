import java.util.*;

public class q5 {

    public static void main(String[] args) {

        int c = 0;
        int x = 65;
        int y = 80;
        int a[] = new int[100];
        int z = x ^ y;
        // System.out.println(z);
        int r, i = 0;
        while (z != 0) {

            r = z % 2;
            a[i] = r;
            z = z / 2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--) {

            if (a[j] == 1) {
                c++;
            }
        }
        System.out.println("Total number of bits needed to be flipped to convert " + x + " to " + y + " is " + c);
    }
}
