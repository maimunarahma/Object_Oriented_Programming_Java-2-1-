
import java.util.Scanner;

class hi {

    double add(double a, double b) {
        return a + b;
    }

    double add(double a, double b, double c) {
        return a + b - c;
    }

    int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        double x = io.nextDouble();
        double y = io.nextDouble();
        double z = io.nextDouble();
        int p = io.nextInt();
        int q = io.nextInt();
        hi ob = new hi();
        System.out.println(ob.add(x, y));
        System.out.println(ob.add(x, y, z));
        System.out.println(ob.add(p, q));
        io.close();
    }
}
