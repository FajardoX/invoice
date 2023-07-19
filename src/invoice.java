public class invoice {
    public static void main(String[] args) {
//        aim is to create a simple invoice for a customer who bought three items from a store.
//        this invoice will include specific details and calculations like GST.

//        item names, their prices
        String itemName1 = "item1";
        double itemPrice1 = 40.5;

        String itemname2 = "item2";
        double itemPrice2 = 10.5;

        String itemname3 = "item3";
        double itemPrice3 = 30.5;
//        store address, and contact number
        String storeName = "MyStore";
        String storeAddress = "123, 1 St.";
        String storeContact = "0123456789";

        System.out.println("Store Name: " + "My Store");
        System.out.println("Store Address: " + "123, 1 St.");
        System.out.println("Store Contact: " + "0123456789");
        System.out.println("TAX INVOICE");

        System.out.println("Transaction Date & Time: " + java.time.LocalDateTime.now()); // explains date-time API
        System.out.println("---------------------");
        System.out.println("item1" + ": " + itemPrice1);
        System.out.println("item2" + ": " + 10.5);
        System.out.println("item3" + ": " + 30.5);

    }
}
