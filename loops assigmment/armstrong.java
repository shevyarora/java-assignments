import java.util.Scanner;

public class armstrong {
   
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        int p=n;


while(i<=n){

    checkarms(i);
    i++;

}
      
    }
    public static void checkarms(int n){
        int sum=0,rem;
        int p=n;
          while(n>0){

            rem=n%10;
            sum=sum+rem*rem*rem;
            n=n/10;
        }
        if(sum==p){
        System.out.println(p);
        }
    }
}
