package HomeWork2.Store.Store;

import HomeWork2.Store.Interface.ChangeLogger;

import java.util.List;

public class Storage extends Shop implements ChangeLogger {

    private int minStockOfGoods; // Минимальный запас товара на условный промежуток времени
    public Storage(double money) {
        super(money);
        minStockOfGoods = 5;
    }
    // Закупка товара в магазин при создании нового Item
    // И устанавливаем минимальное количество товара в зале
    // Вычитаем с баланса стоимость закупки
    public void buyGoodToShop(Item item) {
        int purchaseQuantity;
        double purchaseCost;
        if (!items.containsKey(item)) {
            purchaseQuantity = item.getDemand() * minStockOfGoods;
            purchaseCost = purchaseQuantity * item.getPurchaseCost();
            items.put(item, purchaseQuantity);
            minQuantityOnCounter.put(item, item.getDemand());
        } else {
            purchaseQuantity = minQuantityOnCounter.get(item) * minStockOfGoods - items.get(item);
            purchaseCost = purchaseQuantity * item.getPurchaseCost();
        }
        setMoney(getMoney() - purchaseCost);

//        String note = "Произведена закупка "
//                + purchaseQuantity + " единиц " + item.toString()
//                + " на сумму - " + purchaseCost
//                + "\nДенег на складе осталось " + money;
//        addLog(note);

/*        addLog(new StringBuilder().append("Произведена закупка ")
                .append(purchaseQuantity)
                .append(" единиц ")
                .append(item.toString())
                .append(" на сумму - ")
                .append(purchaseCost)
                .append("\nДенег на складе осталось ")
                .append(money)
                .toString()); */
        System.out.println("Произведена закупка "
                + purchaseQuantity + " единиц " + item.toString()
                + " на сумму - " + purchaseCost
                + "\nДенег на складе осталось " + money);
    }

    public void buyGoodToShop(List<Item> productList) {
        if (productList == null) return;
        for (Item item : productList) {
            this.buyGoodToShop(item);
        }
    }

    // Передача товара со склада на прилавок
    public void transferItemToShowRoom(ShowRoom showRoom, Item item) {

    }
}
