import java.util.*;
public class answer2 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=0;
        int sum=0;

        while(n!=-1){

            n=sc.nextInt();
            if(n!=-1){
                sum=sum+n;
            }
        }
        System.out.println(sum);
       
    }
    
}

       