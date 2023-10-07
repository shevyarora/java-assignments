import java.util.Scanner;

class middlechr{

   void middlechar(String in){
   
    if((in.length())%2!=0)
     System.out.println(in.charAt((in.length())/2));
    else{
    System.out.print(in.charAt((in.length()/2)-1));
    System.out.print(in.charAt(in.length()/2));
    }
    
   }
}
public class q3 {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    middlechr obj=new middlechr();
    String input=sc.nextLine();

    obj.middlechar(input);


 }   
}
