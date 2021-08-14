package replit08_OOP._06TV1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TV tv = new TV();
        System.out.println(tv.getVolumeLevel());
        tv.turnOff();
                System.out.println("set channel");
        tv.setChannel(in.nextInt());

                System.out.println("brand name");
        TV tv2 = new TV(in.next());
        tv2.turnOn();
        tv2.turnOn();
                System.out.println("set channel");
        tv2.setChannel(in.nextInt());
                System.out.println("set channel again");
        tv2.setChannel(in.nextInt());
                System.out.println("set volume");
        tv2.setVolumeLevel(in.nextInt());
                System.out.println(tv2.volumeLevel);
        tv2.volumeUp();
    }

}
