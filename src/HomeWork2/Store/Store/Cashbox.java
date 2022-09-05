package HomeWork2.Store.Store;

public class Cashbox {

    private double money;

    public Cashbox(double money) {
        this.money = money;
    }
    public Cashbox() {
        new Cashbox(0);
    }

    public double getMoney() {
        return money;
    }

    private void setMoney(double money) {
        this.money += money;
    }

    public void putMoneyInBox(double money) {
        setMoney(money);
    }
    public void takeMoneyFromBox(double money) { setMoney(-money); }
}
