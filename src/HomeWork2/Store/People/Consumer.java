package HomeWork2.Store.People;

import HomeWork2.Store.Store.Item;

import java.util.HashMap;
import java.util.Map;

public class Consumer extends Human {
    double money;
    Map<Item, Integer> wishList;

    public Consumer(String name, double money, int loveIndex) {
        super(name, loveIndex);
        this.money = money;
        wishList = new HashMap<>();
    }

    public double getMoney() {
        return money;
    }

    public Map<Item, Integer> getWishList() {
        return wishList;
    }

    public void addItemToWishList(Item item, int quantity) throws Exception {
        if (quantity <= 0) {
            throw new Exception("Нельзя добавить количество товара <= 0");
        }
        wishList.put(item, wishList.getOrDefault(item, 0) + quantity);
        System.out.printf("Товар %s успешно добавлен", item);
    }

}
