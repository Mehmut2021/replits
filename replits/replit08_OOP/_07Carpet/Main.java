package replit08_OOP._07Carpet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Carpet c = new Carpet();
        System.out.println(c);
        System.out.println(c.totalPrice);

        Carpet c2 = new Carpet(in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextBoolean());
        System.out.println(c.totalPrice);
        System.out.println(c2);

    }
}
