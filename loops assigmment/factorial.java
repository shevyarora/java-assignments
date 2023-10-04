import java.util.Scanner;

public class factorial {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int i=1;
    int fact=1;

    int n=sc.nextInt();
    if(n==0){
        System.out.println("0!=1");
    }
    else{
    while(i<=n){

        fact=fact*i;
        System.out.println(i+"!"+"="+fact);
        i++;
    }
}
  }  
}
