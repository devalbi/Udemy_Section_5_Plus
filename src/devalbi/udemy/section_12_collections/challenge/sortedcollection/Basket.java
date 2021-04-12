package devalbi.udemy.section_12_collections.challenge.sortedcollection;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by dev on 17/02/2016.
 */
public class Basket {
    private final String name;
    private final Map<StockItem, Integer> list;

    public Basket(String name) {
        this.name = name;
        this.list = new TreeMap<>();
    }

    public int addToBasket(StockItem item, int quantity) {
        if ((item != null) && (quantity > 0) && (checkReservedStock(item, quantity))) {

            int inBasket = list.getOrDefault(item, 0);
            item.reserveStock(quantity);

            list.put(item, inBasket + quantity);
            return inBasket;
        }
        return 0;
    }

    public void checkoutBasket() {
        if(list.isEmpty()) {
            return;
        }

        for (Map.Entry<StockItem, Integer> item : list.entrySet()) {
            StockItem stockItem = item.getKey();
            int basketQty = item.getValue();

            stockItem.adjustStock(-basketQty);
            stockItem.removeReservedStock(basketQty);
        }
        list.clear();
    }

    public int removeReservedItemFromBasket(StockItem item, int quantityToRemove) {
        if ((item == null) || (quantityToRemove < 0) || (item.getReservedStock() <= quantityToRemove)) {
            return 0;
        }

        int inBasket = list.getOrDefault(item, 0);
        int reservedInBasket = list.get(item);

        if(item.getReservedStock() == 0) {
            list.remove(item);
        } else if(reservedInBasket < quantityToRemove) {
            //Removing more stock than in the basket.
            quantityToRemove = reservedInBasket;
        }

        item.removeReservedStock(quantityToRemove);
        list.put(item, inBasket - quantityToRemove);
        return inBasket;
    }

    public boolean checkReservedStock(StockItem item, int quantityToReserve) {
        if(item.stockMinusReservedStock(quantityToReserve) >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public Map<StockItem, Integer> Items() {
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s = "\nShopping basket " + name + " contains " + list.size() + ((list.size() == 1) ? " item" : " items") + "\n";
        double totalCost = 0.0;
        for (Map.Entry<StockItem, Integer> item : list.entrySet()) {
            s = s + item.getKey() + ". " + item.getValue() + " reserved" +
                    " and this.reserved = " + item.getKey().getReservedStock() +
                    " and available stock equals: " + item.getKey().stockMinusReservedStock() +"\n";
            totalCost += item.getKey().getPrice() * item.getValue();
        }
        return s + "Total cost " + totalCost;
    }
}
