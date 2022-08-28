package HomeWork1;

public class Link {
    private Person personFirst;
    private Person personSecond;
    private Relation relation;

    public Link(Person personFirst, Person personSecond, Relation relation) {
        this.personFirst = personFirst;
        this.personSecond = personSecond;
        this.relation = relation;
    }

    public Person getPersonSecond() {
        return personSecond;
    }

    public Relation getRelation() {
        return relation;
    }
}
