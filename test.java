class A {
    int a = 5;

    void display() {
        a = 10;
        int b=5;
        System.out.println("Value of a= " + a);
    }
}

public class test { 
    public static void main(String[] args) {
        A ob = new A();
        ob.display();
    }
}
