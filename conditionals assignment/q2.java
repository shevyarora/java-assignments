import java.util.*;

public class q2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to find its absolute value :");

        int num = sc.nextInt();

        if (num >= 0) {

            System.out.println(num);
        } else {
            System.out.println(-(num));
        }
    }

}