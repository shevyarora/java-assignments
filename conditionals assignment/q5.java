import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an operator (+, -, *, /):");
        char operator = sc.next().charAt(0);

        System.out.println("Enter two numbers :");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        switch (operator) {

            case '+':
                System.out.println((num1 + "+" + num2) + "=" + (num1 + num2));
                break;

            case '-':
                System.out.println((num1 + "-" + num2) + "=" + (num1 - num2));
                break;
            case '*':
                System.out.println((num1 + "*" + num2) + "=" + (num1 * num2));
                break;

            case '/':
                System.out.println((num1 + "/" + num2) + "=" + (num1 / num2));
                break;

            default:

                System.out.println("Invalid operator !");

        }

    }
}
