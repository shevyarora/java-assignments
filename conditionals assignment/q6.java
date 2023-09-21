import java.util.*;

public class q6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks :");
        int num = sc.nextInt();

        if (num > 90 && num <= 100) {
            System.out.println("A+");
        } else if (num > 80 && num <= 90) {
            System.out.println("A");
        } else if (num > 70 && num <= 80) {
            System.out.println("B+");
        } else if (num > 60 && num <= 70) {
            System.out.println("B");
        } else if (num > 50 && num <= 60) {
            System.out.println("C");
        } else if (num > 40 && num <= 50) {
            System.out.println("D");
        } else if (num > 30 && num <= 40) {
            System.out.println("E");
        } else {
            System.out.println("F");
        }
    }
}
