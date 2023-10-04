import java.util.Scanner;

public class sumofprime {
    
    public static void main(String[] args) {
      Scanner sc =new Scanner (System.in);  
        int n=sc.nextInt();
        int count=0;
int rem=0;
int sum=0;
   int flag1=0; 
   int digits=0;
   
while(n>0){
    count=0;
    rem=n%10;
    for(int i=1;i<=rem;i++){

        if(rem%i==0)
        {
            count++;
        }  
    }
    if(count==2)
    {
         flag1++;
    }

    n/=10;
    digits++;

}

// System.out.println(digits);
// System.out.println(flag1);
if(digits==1){
    System.out.println("False");
}
else if(flag1 == digits){
    System.out.println("true");
}
else{
    System.out.println("False");
}
    }
}
