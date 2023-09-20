import java.util.*;

public class q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no. :");
        int num = sc.nextInt();

        int d, sum = 0;
        while (num != 0) {

            d = num % 10;
            num = num / 10;
            sum = sum + d;
        }
        System.out.println("Sum of Digits of is " + sum);
    }
}
