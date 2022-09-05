package HomeWork2.Store.Store;

import java.util.HashMap;
import java.util.Map;

public abstract class Shop {
    protected double money;
    protected Map<Item, Integer> items;
    protected Map<Item, Integer> minQuantityOnCounter;

    public Shop(double money) {
        this.money = money;
        items = new HashMap<>();
        minQuantityOnCounter = new HashMap<>();
    }
    public Shop() {
        items = new HashMap<>();
        minQuantityOnCounter = new HashMap<>();
    }

    public double getMoney() { return money; }
    protected void setMoney(double money) {
        this.money = money;
    }

    public Map<Item, Integer> getItems() {
        return items;
    }

    public Map<Item, Integer> getMinQuantityOnCounter() {
        return minQuantityOnCounter;
    }
}
