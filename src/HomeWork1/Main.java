package HomeWork1;

public class Main {
    public static void main(String[] args) {
        GenTree tree = new GenTree();
        Person me = new Person("Иван Иванович");
        Person dad = new Person("Иван Андреевич");
        Person mom = new Person("Лариса Петровна");
        Person brother = new Person("Алексей Иванович");
        Person grandMom = new Person("Надежда Павловна");
        tree.addLinkPerson(me, dad, Relation.FATHER, Relation.SON);
        tree.addLinkPerson(me, mom, Relation.MOTHER, Relation.SON);
        tree.addLinkPerson(me, brother, Relation.BROTHER, Relation.BROTHER);
        tree.addLinkPerson(me, grandMom, Relation.GRANDMOTHER, Relation.GRANDSON);

        Research.makeResearch(me, Relation.MOTHER, tree);
        Research.makeResearch(grandMom, Relation.GRANDSON, tree);
    }
}
