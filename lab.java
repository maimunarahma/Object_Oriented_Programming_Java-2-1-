
import java.util.Scanner;

public class lab {

    double sum(double a, double b) {
        return (a + b);

    }
    double subtraction(double a,double b){
 return a-b;
    }
    double mul(double a,double b){
      return a*b;
    }

     double division(double a,double b){
      if(a>b) 
       return a/b;
        else
        return b/a;
     }
    public static void main(String[] args) {
        try (Scanner myInput = new Scanner(System.in)) {
            System.out.println("Enter myInput 1");
            double x = myInput.nextDouble();
            System.out.println("Enter myInput 2");
            double y = myInput.nextDouble();
            
            lab op = new lab();
            
            System.out.println(op.sum(x, y));
            System.out.println(op.subtraction(x, y));
            System.out.println(op.mul(x, y));
            System.out.println(op.division(x, y));
          
        }

    }

}
