public class invoice {
    public static void main(String[] args) {
//        aim is to create a simple invoice for a customer who bought three items from a store.
//        this invoice will include specific details and calculations like GST.

//        item names, their prices
        String itemName1 = "item1";
        double itemPrice1 = 40.5;

        String itemName2 = "item2";
        double itemPrice2 = 10.5;

        String itemName3 = "item3";
        double itemPrice3 = 30.5;
//        store address, and contact number
        String storeName = "MyStore";
        String storeAddress = "123, 1 St.";
        String storeContact = "0123456789";

        System.out.println("Store Name: " + storeName);
        System.out.println("Store Address: " + storeAddress);
        System.out.println("Store Contact: " + storeContact);

        System.out.println("TAX INVOICE");
        System.out.println("---------------------");
        System.out.println(itemName1 + ": " + itemPrice1 + "123");
        System.out.println(itemName2 + ": " + itemPrice2);
        System.out.println(itemName3 + ": " + itemPrice3);

    }
}
