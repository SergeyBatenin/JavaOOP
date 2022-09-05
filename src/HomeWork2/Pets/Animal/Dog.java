package HomeWork2.Pets.Animal;

public class Dog extends Animal{

    public Dog(String nickname) {
        super(nickname);
    }

    @Override
    public void makeSound() {
        System.out.println("-Гав-гав!");
    }

    @Override
    public void commandResponse(String command) {
        switch (command) {
            case "Сидеть":
                System.out.println(getNickname() + " садится.");
                break;
            case "Кушать":
                System.out.println(getNickname() + " несется с лаем на кухню.");
                break;
            case "Гулять":
                System.out.println(getNickname() + " несется в прихожую и несет поводок.");
                makeSound();
                break;
            case "Место":
                System.out.println(getNickname() + " опустив голову идет на свою лежанку");
                break;
            default:
                System.out.println(getNickname() + " смотрит на вас и виляет хвостом.");
                break;
        }
    }
}
