package HomeWork2.Pets.Animal;

import HomeWork2.Pets.PetsAction;

public abstract class Animal implements PetsAction {
    private String nickname;
    public Animal(String nickname) {
        this.nickname = nickname;
    }
    public String getNickname() {
        return nickname;
    }
    @Override
    public String toString() {
        return "{" + this.getClass().getSimpleName() +
                " '" + nickname + '\'' +
                '}';
    }
}
