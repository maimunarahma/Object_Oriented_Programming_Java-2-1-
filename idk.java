
import java.util.Scanner ;


public class idk {
    
    double sum(double a, double b){
            return (a+b);

    }
    double sub(double a, double b){
        return a-b;
    }

    public static void main(String[] args) {
        Scanner mt=new Scanner(System.in);
        
        System.out.println("Enter Number 1");
        double a=mt.nextDouble();
        System.out.println("Enter number 2");
        double b=mt.nextDouble();
       idk op=new idk();
       System.out.println(op.sum(a,b));
       System.out.println(op.sub(a,b));
    }
}
