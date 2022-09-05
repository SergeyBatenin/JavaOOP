package HomeWork2.Pets;


import HomeWork2.Pets.Animal.Animal;
import HomeWork2.Pets.Animal.Cat;
import HomeWork2.Pets.Animal.Dog;
import HomeWork2.Pets.Animal.Rat;
import HomeWork2.Pets.Owner.Owner;

public class Main {
    public static void main(String[] args) {
        Owner ivan = new Owner("Ivan");
        Animal murka = new Cat("Murka");
        Animal sharik = new Dog("Sharik");
        Animal lariska = new Rat("Lariska");
        RelationInterface relations = new RalationHumanAnimal();
        relations.addAnimalToHuman(ivan, murka);
        relations.addAnimalToHuman(ivan, sharik);
        relations.addAnimalToHuman(ivan, lariska);
        System.out.println(relations.getAnimalByHuman(ivan));
        relations.makeCommand(ivan, "Кушать", murka);
        relations.makeCommand(ivan, "Кушать", sharik);
        relations.makeCommand(ivan, "Гулять", lariska);
        relations.makeCommand(ivan, "Гулять", sharik);
    }
}
