import java.util.Scanner;

public class fibonacci{

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int f0=0;
        int f1=1;
        int sum=0;
        System.out.println("enter n :");
        int n=sc.nextInt();
        int i=0;
        while(i!=n){
            

            // System.out.print(f0);
            System.out.print(f1);
            sum=f0+f1;
            f0=f1;
            f1=sum;
            i++;

        }

    }
}