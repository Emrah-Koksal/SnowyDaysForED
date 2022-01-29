package EmrePackage;

public class task001 {
    public static void main(String[] args) {

        int x = 50, y = 100;

        int flag = x;
        x = y;
        y = flag;

        System.out.println("After swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}
