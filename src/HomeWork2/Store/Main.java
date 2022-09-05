package HomeWork2.Store;

import HomeWork2.Store.Store.Cashbox;
import HomeWork2.Store.Store.Item;
import HomeWork2.Store.Store.Shop;
import HomeWork2.Store.Store.ShowRoom;
import HomeWork2.Store.Store.Storage;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Storage storage = new Storage(1000);
        Shop showRoom = new ShowRoom();
        Cashbox cashBox = new Cashbox();

        Item milk = new Item("Milk", 2.13);
        Item bread = new Item("Bread", 0.95);
        Item meat = new Item("Meat", 10.49);
        Item bean = new Item("Bean", 3.25);
        Item chicken = new Item("Chicken", 4.86);
        Item hamburger = new Item("Hamburger", 1.33);
        Item butter = new Item("Butter", 3.75);
        Item cheese = new Item("Cheese", 9.87);
        Item spice = new Item("Spice", 0.44);
        List<Item> productList = Arrays.asList(milk, bread, meat, bean, chicken, hamburger, butter, cheese, spice);
        storage.buyGoodToShop(productList);
    }

}
