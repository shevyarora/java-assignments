import java.util.*;
public class bulb {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int i=1;
        int sqr=1;
        while(sqr<=n){

            System.out.println(sqr);
            i++;
            sqr=i*i;
        }

    }
}

