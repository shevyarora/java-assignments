import java.util.Scanner;

class leap{

    boolean leapyear(int year){

        if((year%4==0 && year%100!=0) || year%400 ==0){
            return true;
        }
        else{
            return false;
        }
    }
}

public class q4 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        leap obj=new leap();
        int year=sc.nextInt();
        boolean result=obj.leapyear(year);
        System.out.println(result);

    }
}
