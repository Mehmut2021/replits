package replit08_OOP._10TJMaxxTask;

public class Main {

    public static void main(String[] args) {

        Item item1 = new Item("Tee1", 3, 1, 12.99);
        Item item2 = new Item("Tee2", 2, 2, 11.99);
        Item item3 = new Item("Tee3", 1, 3, 14.99);
        Item item4 = new Item("Tee4", 3, 4, 19.99);
        Item item5 = new Item("Tee5", 2, 5, 12.99);

        OnSaleItem item6 = new OnSaleItem("Tee6", 3, 6, 19.99, 5);
        OnSaleItem item7 = new OnSaleItem("Tee7", 1, 7, 12.99, 10);
        OnSaleItem item8 = new OnSaleItem("Tee8", 2, 8, 14.99, 10);

        TJMaxx regItemList = new TJMaxx();

        regItemList.addRegularItem(item1);
        regItemList.addRegularItem(item2);
        regItemList.addRegularItem(item3);
        regItemList.addRegularItem(item4);
        regItemList.addRegularItem(item5);

        regItemList.addOnSaleItem(item6);
        regItemList.addOnSaleItem(item7);
        regItemList.addOnSaleItem(item8);

        System.out.println(regItemList);

        regItemList.buyItem(2);//item quantity initially == 2 --> item quantity == 1 after this line
        System.out.println(regItemList.getRegularItems());

        regItemList.buyItem(2);//item quantity == 1 prior this line
        System.out.println(regItemList.getRegularItems());//item is removed from the list after line 34

        System.out.println("This should get the price for catalog number 4 --> " + regItemList.getItemPrice(4));
    }
}
