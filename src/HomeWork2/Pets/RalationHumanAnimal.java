package HomeWork2.Pets;

import HomeWork2.Pets.Animal.Animal;
import HomeWork2.Pets.Owner.Owner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RalationHumanAnimal implements RelationInterface {

    private Map<Owner, List<Animal>> humanToAnimals;


    public RalationHumanAnimal() {
        humanToAnimals = new HashMap<>();
    }

    @Override
    public void addAnimalToHuman(Owner owner, Animal animal) {
        if (humanToAnimals.containsKey(owner)) {
            humanToAnimals.get(owner).add(animal);
        } else {
            List<Animal> addAnimal = new ArrayList<>();
            addAnimal.add(animal);
            humanToAnimals.put(owner, addAnimal);
        }
    }

    @Override
    public List<Animal> getAnimalByHuman(Owner owner) {
        return humanToAnimals.get(owner);
    }

    public void printPets(Owner owner, Animal animal) {

    }
    public void makeCommand(Owner owner, String command, Animal animal) {
        System.out.println(owner.getName() + " говорит " + animal.getNickname() + " " + command);
        animal.commandResponse(command);
    }
    private boolean checkClass (Animal animal, Class<?> cls) {
        return cls.isInstance(animal);
    }
//        System.out.println(checkClass(murka, Cat.class));
//        System.out.println(checkClass(sharik, Cat.class));
}
