package HomeWork2.Store.Interface;

import HomeWork2.Store.People.Consumer;
import HomeWork2.Store.People.Seller;
import HomeWork2.Store.Store.Item;

import java.util.List;

public interface CommunicationHuman {

    default double costOfItem(Item item) {
        return item.getPurchaseCost();
    }

    default void isItemsInStorage(Seller seller, List<Item> shoppingList) {
        for (Item item : shoppingList) {
//            if (!seller.getItems().contains(item)) {
//                System.out.println("У нас нет " + item.getNameOfItem());
//            }
        }
    }

    //Дописать метод
    default double totalCost() {
        return 0.0;
    }

    default void areYouPoor(Consumer consumer) {
        if (totalCost() > consumer.getMoney()) {
            System.out.println("Ты нищеброд");
        } else {

        }
    }
}
