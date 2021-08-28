package replit08_OOP._10TJMaxxTask;

import java.util.ArrayList;

public class TJMaxx {

    /**
     * Private ArrayList to hold regular Item objects
     * and OnSaleItem objects that represent items that sell in TJMaxx
     */
    private ArrayList<Item> regularItems;
    private ArrayList<OnSaleItem> onSaleItems;

    /**
     * Public no-args constructor - Instantiates regularItems and onSaleItems lists
     * as new ArrayList
     */
    public TJMaxx() {
        //TODO
        regularItems = new ArrayList<>();
        onSaleItems = new ArrayList<>();
    }

    /**
     * adds an item object to regularItems list
     * @param item
     */
    public void addRegularItem(Item item) {
        regularItems.add(item);
    }

    /**
     * adds OnSaleItem object to onSaleItems list
     * @param item
     */
    public void addOnSaleItem(OnSaleItem item) {
        onSaleItems.add(item);
    }

    /**
     * getter for regularItems
     * @return
     */
    public ArrayList<Item> getRegularItems() {
        //TODO change from null
        return regularItems;
    }

    /**
     * getter for onSaleItems
     * @return
     */
    public ArrayList<OnSaleItem> getOnSaleItems() {
        //TODO change from null
        return onSaleItems;
    }

    /**
     * return count of regularItem object
     * @return
     */
    public int regularItemsCount() {
        //TODO change from -1
        return regularItems.size();
    }

    /**
     * returns count of onSaleItems in TJ Maxx
     * @return
     */
    public int onSaleItemsCount() {
        //TODO change from -1
        return onSaleItems.size();
    }

    /**
     * returns the name of each item in TJ Maxx starting
     * from regular item then onSaleItems
     * @return
     */
    public ArrayList<String> getAllItemNames() {
        ArrayList<String> nameList= new ArrayList<>();
        for (Item regularItem : regularItems) {
            nameList.add(regularItem.getName());
        }
        for (OnSaleItem onSaleItem : onSaleItems) {
            nameList.add(onSaleItem.getName());
        }

        return nameList;
    }

    /**
     * gets catalog number and returns price for the item
     * it will search for the item both regularItems and onsaleonSaleItems
     * @param catalogNumber
     * @returns 0.0 if product cannot be found with that catalognumber
     */
    public double getItemPrice(int catalogNumber)
    {

        for (Item regularItem : regularItems) {
            if(catalogNumber == regularItem.getCatalogNumber()){
                return regularItem.getPrice();
            }
        }
        for (OnSaleItem onSaleItem : onSaleItems) {
            if(catalogNumber == onSaleItem.getCatalogNumber()){
                return onSaleItem.getPrice();
            }
        }
        return 0.0;
    }

    /**
     * accepts a name then searches
     * amoung onSaleItems. Once it finds, the method will return
     * that OnSaleItem object
     * @param name
     * @return
     */
    public OnSaleItem getOnSaleItem(String name)
    {

        for (OnSaleItem onSaleItem : onSaleItems) {
            if(onSaleItem.getName().equals(name)){
                return onSaleItem;
            }
        }
        return null;
    }

    /**
     * removes the item with matching catalogNumber
     * from both regularItems and onSaleItems.
     * Does nothing if not found
     * @param catalogNumber
     */
    public void removeItem(int catalogNumber) {
        regularItems.removeIf(regularItem -> catalogNumber == regularItem.getCatalogNumber());
        onSaleItems.removeIf(onSaleItem -> catalogNumber == onSaleItem.getCatalogNumber());

    }

    /**
     * - it accepts a catalog number and finds that item
     * among regularItems and onSaleItems
     * - if it finds the item:
     *   - decrease the count of the Item by 1
     *   - if count reaches 0 after decrementing then remove the product(call removeItem method)
     *
     * @param catalogNumber
     */
    public void buyItem(int catalogNumber) {

        for (Item regularItem : regularItems) {
            int quantity;
            if(catalogNumber == regularItem.getCatalogNumber()){
                quantity = regularItem.getQuantity()-1;//removes 1 from quantity
                if(quantity == 0){
                    removeItem(catalogNumber);
                    return;//removes the item from the list if quantity is zero after line 159
                }
                regularItem.setQuantity(quantity);
            }
        }
        for (OnSaleItem onSaleItem : onSaleItems) {
            int quantity;
            if(catalogNumber == onSaleItem.getCatalogNumber()){
                quantity = onSaleItem.getQuantity()-1;//removes 1 from quantity
                if(quantity == 0){
                    removeItem(catalogNumber);
                    return;//removes the item from the list if quantity is zero after line 170
                }
                onSaleItem.setQuantity(quantity);
            }
        }
    }

    @Override
    public String toString() {
        return "TJMaxx{" +
                "regularItems=" + regularItems + "\n" +
                ", onSaleItems=" + onSaleItems +
                '}';
    }
}
