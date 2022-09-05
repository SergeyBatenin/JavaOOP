package HomeWork2.Store.People;

import HomeWork2.Store.Interface.CommunicationHuman;

public abstract class Human implements CommunicationHuman {
    private String name;
    private int loveIndex;

    public Human(String name, int loveIndex) {
        this.name = name;
        this.loveIndex = loveIndex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLoveIndex() {
        return loveIndex;
    }
}
