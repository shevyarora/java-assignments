public class answer5 {
    public static void main(String[] args) {
        
        int r=5;
        for(int i=0;i<r;i++){

            for(int j=0;j<r;j++){

                if(i==j || i+j==r-1 )
                {
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
