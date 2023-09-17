import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();

        int sumOfMarks = sub1 + sub2 + sub3;
        int percentage = (sumOfMarks) / 3;

        System.out.println("Total Marks :" + sumOfMarks);
        System.out.println("Percentage marks :" + percentage + "%");
    }
}
