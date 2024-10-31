import java.util.Scanner ;

public class Sum {
   
    public static void main(String[] args) {
        
        Scanner m=new Scanner(System.in);
        System.out.println("Enter Number 1");
        float a=m.nextFloat();
        System.out.println("Enter number 2");
        float b=m.nextFloat();
    
      float sum=a+b;
      System.out.println("Sum of number 1 and number 2 is " +sum);
    }
}
