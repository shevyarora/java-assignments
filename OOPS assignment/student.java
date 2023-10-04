import java.util.Scanner;

public class student{

    String name;
    int roll_no;
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        student obj = new student();

        obj.name = "John";
        obj.roll_no= 2;
       
System.out.println(obj.name);
System.out.println(obj.roll_no);

    }
}