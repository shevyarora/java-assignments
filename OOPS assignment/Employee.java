import java.util.Scanner;

public class Employee {
    
    String name;
    int yoj;
    double salary;
    String address;

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        Employee obj = new Employee();
        Employee obj2 = new Employee();
        Employee obj3 = new Employee();
       

    obj.name=sc.next();
    obj.yoj=sc.nextInt();
    obj.salary=sc.nextDouble();
    sc.nextLine();
    obj.address=sc.nextLine();

    
    obj2.name=sc.next();
    obj2.yoj=sc.nextInt();
    obj2.salary=sc.nextDouble();
    sc.nextLine();
    obj2.address=sc.nextLine();

    
    obj3.name=sc.next();
    obj3.yoj=sc.nextInt();
    obj3.salary=sc.nextDouble();
    sc.nextLine();
    obj3.address=sc.nextLine();
    
    System.out.println("   NAME   "+ "   Year of joining  "+ "   Salary   "+ "  Address  ");

        System.out.println("    "+obj.name    +"        "+ obj.yoj +"              "+ obj.salary  +"              "+ obj.address);
        System.out.println("    "+obj2.name   +"       "+ obj2.yoj +"              "+ obj2.salary +"              "+ obj2.address);
        System.out.println("    "+obj3.name   +"       "+ obj3.yoj +"              "+ obj3.salary +"              "+ obj3.address);

    }


}