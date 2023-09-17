import java.util.Scanner;

public class q1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String firstName = sc.next();
        String lastName = sc.next();
        int roll = sc.nextInt();
        String field = sc.next();

        System.out.println("Name :" + firstName + " " + lastName);
        System.out.println("Roll number  :" + roll);
        System.out.println("Field of Interest :" + field);

    }
}