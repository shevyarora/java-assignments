public class diamond {
    public static void main(String[] args) {
        
        int n=65;
        int r=5;
                for(int i=1;i<=r;i++){
        
                    for(int p=r-1;p>=i;p--){
        
                        System.out.print(" ");
                    }
                    for(int j=0;j<2*i-1;j++){
         
                    
                        System.out.print((char)(n+j));
                        
                    }
                    System.out.println();
                }
                int k=0,l=0;
                for(int i=r-1;i>=1;i--){
                    
                    for(int p=0;p<=k;p++) {
                        
                        System.out.print(" ");
                    }
                    for(int j=2*i-1;j>=1;j--){
                       System.out.print((char)(n+l));
                       l++;
                    }
                    System.out.println();
                    k++;
                    l=0; 
}
    }
}
