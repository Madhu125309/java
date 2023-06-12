public class emp {
    int a = 100;// instane var
    int b = 200;
    int c = 50;
    static int d = 10; // static var

    public static void main(String[] args) {
        emp e1 = new emp(); // object
        emp e2 = new emp();
        System.out.println(e1.a);
        System.out.println(e2.b);
        System.out.println(e1.c);
        System.out.println(e2.d);
        System.out.println(d);
        System.out.println(emp.d);
    }

}