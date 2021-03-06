package replit08_OOP._03GetterSetter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Db db = new Db(in.next(), in.nextInt());

        System.out.println(db.getData());
        System.out.println(db.getYint());

        db.setData(in.next());
        db.setYint(in.nextInt());

        System.out.println(db.getData());
        System.out.println(db.getYint());

    }

}
