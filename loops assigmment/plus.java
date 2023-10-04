public class plus {
    
    public static void main(String[] args) {
        
        int r=3;
        for(int i=1;i<=2*r-1;i++){

            for(int j=1;j<=2*r-1;j++){
               
              if(j==r||i==r) {
                System.out.print("*");
              }
              else{
                System.out.print(" ");
              }

            }
            System.out.println();
        }
}
}
