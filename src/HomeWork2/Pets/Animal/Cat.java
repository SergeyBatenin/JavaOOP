package HomeWork2.Pets.Animal;

public class Cat extends Animal{

    public Cat(String nickname) {
        super(nickname);
    }

    @Override
    public void makeSound() {
        System.out.println("- Мяу");
    }

    @Override
    public void commandResponse(String command) {
        switch (command) {
            case "Кушать":
                System.out.println(getNickname() + " бежит на кухню подняв хвост.");
                makeSound();
                break;
            case "Гладим":
                System.out.println(getNickname() + " закрывает глаза и урчит.");
                break;
            default:
                System.out.println(getNickname() + " не реагирует на вас.");
                break;
        }
    }
}
