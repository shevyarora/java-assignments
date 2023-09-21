import java.util.*;

public class q3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Cost price of an item :");
        int cp = sc.nextInt();
        System.out.println("Enter Selling price of an item :");
        int sp = sc.nextInt();

        if (cp > sp) {

            System.out.println("Loss =" + (cp - sp));
        } else if (cp == sp) {

            System.out.println("Neither Profit nor loss");
        } else {
            System.out.println("Profit =" + (sp - cp));
        }
    }

}
