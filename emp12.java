public class emp12 {
    int id = 100;
    String name = "madhu";
    String address = "kadapa";
    static String org = "hcl";

    public static void main(String[] args) {
        emp12 e1 = new emp12();
        // instane var
        System.out.println(e1.id);
        System.out.println(e1.name);
        System.out.println(e1.address);
        // static var
        System.out.println(e1.org);
        // local var
        int a = 10;
        System.out.println(a);
    }
}
