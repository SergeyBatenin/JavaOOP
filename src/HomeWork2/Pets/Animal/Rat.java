package HomeWork2.Pets.Animal;

import HomeWork2.Pets.Animal.Animal;

public class Rat extends Animal {

    public Rat(String nickname) { super(nickname); }

    @Override
    public void makeSound() {
        System.out.println("Пи-пи-пи");
    }

    @Override
    public void commandResponse(String command) {
        System.out.println(getNickname() + " cмотрит на него умными глазами");
    }
}
