package devalbi.udemy.section_12_collections.challenge.sortedcollection;

/**
 * Created by dev on 16/02/2016.
 */
public class StockItem implements Comparable<StockItem> {
    private final String name;
    private double price;
    private int quantityStock = 0;
    private int reservedStock = 0; // Done here to void duplication in controllers

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityStock = 0;  // or here (but you wouldn't normally do both).
    }

    public StockItem(String name, double price, int quantityStock) {
        this.name = name;
        this.price = price;
        this.quantityStock = quantityStock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getReservedStock() {
        return reservedStock;
    }

    public int quantityInStock() {
        return quantityStock;
    }

    public void setPrice(double price) {
        if(price > 0.0) {
            this.price = price;
        }
    }

    public void adjustStock(int quantity) {
        int newQuantity = this.quantityStock + quantity;
        if(newQuantity >=0) {
            this.quantityStock = newQuantity;
        }
    }

    public void reserveStock(int reservedQuantity) {
        int checkReservedQuantity = this.quantityStock - reservedQuantity;

        if(checkReservedQuantity >= 0) {
            this.reservedStock += reservedQuantity;
        }
    }

    public void removeReservedStock(int reservedQuantityToRemove) {
        if(reservedQuantityToRemove < 0) {
            return;
        }

        if(this.reservedStock < reservedQuantityToRemove) {
            //If user tries to remove more stock than is reserved, sets to Zero
            this.reservedStock = 0;
        } else {
            this.reservedStock -= reservedQuantityToRemove;
        }
    }

    public int stockMinusReservedStock() {
        return this.quantityStock - this.reservedStock;
    }

    public int stockMinusReservedStock(int newReservedStock) {
        return (this.quantityStock - this.reservedStock) - newReservedStock;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Entering StockItem.equals");
        if(obj == this) {
            return true;
        }

        if((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }

        String objName = ((StockItem) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 31;
    }

    @Override
    public int compareTo(StockItem o) {
        if(this == o) {
            return 0;
        }

        if(o != null) {
            return this.name.compareTo(o.getName());
        }

        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return this.name + " : price " + this.price;
    }
}
