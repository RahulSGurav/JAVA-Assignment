public class static1 {
    static int a = 10;
    static int b;

    static void method(int x){
        System.out.println("X is: "+x);
        System.out.println("a is: "+a);
        System.out.println("b is: "+b);
    }
    static{
        System.out.println("Static block is called");
        b = a*10;
    }
    public static void main(String[] args) {
        method(4);
    }
    
}
