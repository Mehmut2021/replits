package replit02_Statements;

import java.util.Scanner;

public class GiftCard {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String item = scan.next();

        int blanket = 60;
        int charger = 15;
        int hat = 25;
        int headphones = 30;
        int laptop = 200;
        int pants = 50;
        int pillow = 40;
        int smartphone = 1000;
        int socks = 5;
        int usbCable = 10;


        if(item.equals(smartphone)||item.equals(laptop)){
            System.out.println("Sorry, not enough funds in your gift card!");
        }else if(item.equals("Blanket")){
            System.out.println("Thank you for your purchase! \n" +
                    "Your current balance is: " + (100-blanket)+"$");
        }else if(item.equals("Charger")){
            System.out.println("Thank you for your purchase!\n" +
                    "Your current balance is: " + (100-charger)+"$");
        }else if(item.equals("Hat")){
            System.out.println("Thank you for your purchase! \n" +
                    "Your current balance is: " + (100-hat) +"$");
        }else if(item.equals("Headphones")){
            System.out.println("Thank you for your purchase! \n" +
                    "Your current balance is: " + (100-headphones)+"$");
        }else if(item.equals("Pants")) {
            System.out.println("Thank you for your purchase! \n" +
                    "Your current balance is: " + (100 - pants) +"$");
        }else if(item.equals("Pillow")) {
            System.out.println("Thank you for your purchase! \n" +
                    "Your current balance is: " + (100 - pillow)+"$");
        }else if(item.equals("Socks")) {
            System.out.println("Thank you for your purchase! \n" +
                    "Your current balance is: " + (100 - socks)+"$");
        }else if(item.equals("USBCable")) {
            System.out.println("Thank you for your purchase! \n" +
                    "Your current balance is: " + (100 - usbCable)+"$");
        }

    }

}

/*

 Let's say I've got a 100$ gift card and you want to buy something in your online store .
 Write a program that will help me to buy something and display leftover balance after purchase.
 - If item is not in the list, display message: _**"Invalid item!"**_.
 - If price is more than 100$, display message: _**"Sorry, not enough funds on your gift card!".**_

> **_List of items_**
> Blanket - 60$
> Charger - 15$
> Hat - 25$
> Headphones - 30$
> Laptop - 200$
> Pants - 50$
> Pillow - 40$
> Smartphone - 1000$
> Socks - 5$
> USB cable - 10$

Hint: if/ else if / else or switch statement

Examples:

```
input: Hat
output:
Thank you for your purchase!
Your current balance is: 75$
```

```
input: Pants
output:
Thank you for your purchase!
Your current balance is: 50$
```


```
input: Laptop
Output:
Sorry, not enough funds on your gift card!
```

```
input: Cupcake
output: Invalid item!
```
 */