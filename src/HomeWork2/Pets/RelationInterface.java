package HomeWork2.Pets;

import HomeWork2.Pets.Animal.Animal;
import HomeWork2.Pets.Owner.Owner;

import java.util.List;

public interface RelationInterface {
    void addAnimalToHuman(Owner owner, Animal animal);
    List<Animal> getAnimalByHuman(Owner owner);
    void printPets(Owner owner, Animal animal);
    void makeCommand(Owner owner, String command, Animal animal);
}
