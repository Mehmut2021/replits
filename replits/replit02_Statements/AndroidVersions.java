package replit02_Statements;

public class AndroidVersions {

    public static void main(String[] args) {

    double version = 10.0;

    if (version == 1.5) {
        System.out.println("Cupcake");
    }
    if (version == 1.6) {
        System.out.println("Donut");
    }
    if (version == 2.1) {
        System.out.println("Eclair");
    }
    if (version == 2.2) {
        System.out.println("Froyo");
    }
    if (version == 2.3) {
        System.out.println("Gingerbread");
    }
    if (version == 3.1) {
        System.out.println("Honeycomb");
    }
    if (version == 4.0) {
        System.out.println("Ice Cream Sandwich");
    }
    if (version == 4.1) {
        System.out.println("Jelly Bean");
    }
    if (version == 4.4) {
        System.out.println("KitKat");
    }
    if (version == 5.0) {
        System.out.println("Lollipop");
    }
    if (version == 8.0) {
        System.out.println("Oreo");
    }
    if (version == 9.0) {
        System.out.println("Pie");
    }
    if (version != 1.5 && version != 1.6 && version != 2.1 && version != 2.2 && version != 2.3
            && version != 3.1 && version != 4.0 && version != 4.1 && version != 4.4 && version != 5.0
            && version != 8.0 && version != 9.0) {
        System.out.println("Sorry, I don't know this version!");
    }


    }

}

/*
Write an if statement that will print android version name based on value of the **_version_** variable.

> `Versions`
> 1.5 - Cupcake > 1.6 - Donut > 2.1 - Eclair > 2.2 - Froyo > 2.3 - Gingerbread > 3.1 - Honeycomb
> 4.0 - Ice Cream Sandwich > 4.1 - Jelly Bean > 4.4 - KitKat > 5.0 - Lollipop > 8.0 - Oreo
> 9.0 - Pie
 */