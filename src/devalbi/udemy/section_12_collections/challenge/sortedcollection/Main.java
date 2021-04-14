package devalbi.udemy.section_12_collections.challenge.sortedcollection;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
	    StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("car", 12.50, 3);
        stockList.addStock(temp);

        temp = new StockItem("chair", 62.0, 10);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.50, 200);
        stockList.addStock(temp);
        temp = new StockItem("cup", 0.45, 7);
        stockList.addStock(temp);

        temp = new StockItem("door", 72.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.50, 36);
        stockList.addStock(temp);

        temp = new StockItem("phone", 96.99, 35);
        stockList.addStock(temp);

        temp = new StockItem("towel", 2.40, 80);
        stockList.addStock(temp);

        temp = new StockItem("vase", 8.76, 40);
        stockList.addStock(temp);

        System.out.println(stockList);

        for(String s: stockList.Items().keySet()) {
            System.out.println(s);
        }

        Basket timsBasket = new Basket("Tim");
        sellItem(timsBasket, "car", 1);
        System.out.println(timsBasket);

        Basket arronBasket = new Basket("Arron");
        sellItem(arronBasket, "car", 1);
        System.out.println(arronBasket);

        sellItem(timsBasket, "car", 1);
        System.out.println(timsBasket);


        System.out.println("\nRemoving Car from Basket");
        StockItem carItem = stockList.get("car");
        timsBasket.removeReservedItemFromBasket(carItem, 1);

        System.out.println(timsBasket);

        if(sellItem(timsBasket, "car", 1) != 1) {
            System.out.println("There are no more cars in stock");
        }

        sellItem(timsBasket, "spanner", 5);
        System.out.println(timsBasket);

        sellItem(timsBasket, "juice", 4);
        sellItem(timsBasket, "cup", 12);
        sellItem(timsBasket, "bread", 1);
        System.out.println(timsBasket);

        System.out.println("\nStockList Before Checkout:");
        System.out.println(stockList);

        System.out.println("\nCustomer Checking out");
        timsBasket.checkoutBasket();

        System.out.println("Arron's Basket");
        System.out.println(arronBasket);

        System.out.println("\nStockList After Checkout");
        System.out.println(stockList);

        //temp = new StockItem("pen", 1.12);
        //stockList.Items().put(temp.getName(), temp);
        stockList.Items().get("car").adjustStock(2000);
        stockList.get("car").adjustStock(-1000);

        System.out.println(stockList);
/*        for(Map.Entry<String, Double> price: stockList.PriceList().entrySet()) {
            System.out.println(price.getKey() + " costs " + price.getValue());
        }*/


    }

    public static int sellItem(Basket basket, String item, int quantity) {
        //retrieve the item from stock list
        StockItem stockItem = stockList.get(item);
        if(stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
      //  if(stockList.sellStock(item, quantity) != 0) {
        if(stockItem.availableStock(quantity) >= 0) {
            basket.addToBasket(stockItem, quantity);
            return quantity;
        }
        return 0;
    }
}
