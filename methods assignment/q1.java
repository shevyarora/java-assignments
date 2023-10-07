class average{

    int avg(int a ,int b,int c){
        return (a+b+c)/3;
    }
}
public class q1{
    public static void main(String[] args) {
        
        average obj=new average();

      int  result=  obj.avg(25,45,65);
      System.out.println(result);

    }
}