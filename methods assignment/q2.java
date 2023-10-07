import java.util.*;

class vowels{
Scanner sc=new Scanner(System.in);
    int countVowels(String in){
       int count=0;
      for(int i=0;i<=in.length()-1;i++){

        if(in.charAt(i) == 'a'||in.charAt(i)=='e'||in.charAt(i)=='i'||in.charAt(i)=='o'||in.charAt(i)=='u'){
            count++;
        }
      }

      return count;
        
    }

}
public class q2 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      vowels obj=new vowels();

     String input=sc.nextLine();

     input=input.toLowerCase();
     
     int result=obj.countVowels(input);

     System.out.println(result);
    }
}
