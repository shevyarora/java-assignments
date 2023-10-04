import java.util.Scanner;

public class Area {
    
    double area;
    double length;
    double breadth;


    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);

        Area obj = new Area();

        obj.length=sc.nextDouble();
        obj.breadth=sc.nextDouble();

       double result= area(obj.length,obj.breadth);  
       System.out.println(result); 

    }
    public static double area(double l , double b){

        return l*b;
    }

}
