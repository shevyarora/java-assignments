import java.util.Scanner;

class smallest{

    int small(int a , int b,int c){
        if(a<b&&a<c){
            return a;
        }
        else if(b<a&& b<c){
            return b;
        }
        else{
            return c;
        }
    }
}
public class q5 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    smallest obj =new smallest();

    int result=obj.small(25,37,29);
    System.out.println(result);
  }  
}
