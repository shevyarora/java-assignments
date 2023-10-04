import java.util.*;

public class primet{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int ar[]= new int[100];
      int n=1;int s=1;
      int count=0;
        int r= sc.nextInt();
        int o=1;
        for(int i=1;i<=r;i++){

            for(int j=r-1;j>=i;j--){
                System.out.print(" ");
            }

            for(int p= 1;p<=i;p++){

                while(n>0 && s!=99){
                    count=0;
                    for(int k=1;k<=n;k++){
                        if(n%k==0){
                            count++;
                        }
                    }
                    if(count==2)
                    {
                        ar[s]=n;
                        s++;
            
                    }
                    n++;
                    
                }

                System.out.print(ar[o]);
                o++;
                
            }
            System.out.println();
            
            
        }

    }
}