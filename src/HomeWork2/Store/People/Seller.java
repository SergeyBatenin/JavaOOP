package HomeWork2.Store.People;

import HomeWork2.Store.Store.Item;

import java.util.ArrayList;
import java.util.List;

public class Seller extends Human{

    private List<Item> items = new ArrayList<>();

    public Seller(String name, int loveIndex) {
        super(name, loveIndex);
    }

    public List<Item> getItems() {
        return items;
    }

}
