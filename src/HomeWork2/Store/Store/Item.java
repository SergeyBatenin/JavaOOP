package HomeWork2.Store.Store;

import java.util.Random;

public class Item {
    private String nameOfItem;
    private double purchaseCost;
    private double sellingCost;
    private int demand; // Теоретически можно сделать какой нибудь справочник
    // с указанием потребности в определенном товаре, но пока оставил воле случая)

    public Item(String nameOfItem, double purchaseCost) {
        this.nameOfItem = nameOfItem;
        this.purchaseCost = purchaseCost;
        this.sellingCost = this.purchaseCost * 1.3;
        demand = new Random().nextInt(1, 7);
    }

    public String getNameOfItem() {
        return nameOfItem;
    }

    public void setNameOfItem(String nameOfItem) {
        this.nameOfItem = nameOfItem;
    }
    public double getPurchaseCost() { return purchaseCost; }

    public void setPurchaseCost(double cost) {
        this.purchaseCost = cost;
    }

    public int getDemand() { return demand; }

    public void setDemand(int demand) { this.demand = demand; }

    @Override
    public String toString() {
        return "Item{" + nameOfItem + " " + purchaseCost + '}';
    }
}
