import java.util.*;

public class q1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length :");
        int length = sc.nextInt();

        System.out.println("Enter the Breadth :");
        int breadth = sc.nextInt();

        if (length == breadth) {
            System.out.println("Square");
        } else {
            System.out.println("Rectangle");
        }

    }
}