class emp {
    int a = 100;
    int b = 200;
}

class Test {
    public static void main(String[] args) {
        emp e1 = new emp();
        emp e2 = new emp();
        emp e3 = new emp();

        System.out.println(e1.a);
        e2.a = 500;
        System.out.println(e2.a);
        System.out.println(e3);
    }
}