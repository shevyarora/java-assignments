import java.util.Scanner;

public class Triangle {


    int s1,s2,s3;
    double s;
    int perimeter;
    double area;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Triangle obj =new Triangle();

        obj.s1=sc.nextInt();
        obj.s2=sc.nextInt();
        obj.s3=sc.nextInt();
        
        obj.s=(obj.s1+obj.s2+obj.s3)/2;
        obj.area=Math.sqrt(obj.s*(obj.s-obj.s1)*(obj.s-obj.s2)*(obj.s-obj.s3));

        obj.perimeter=obj.s1+obj.s2+obj.s3;


        System.out.println(obj.area);
        System.out.println(obj.perimeter);
    }
}
