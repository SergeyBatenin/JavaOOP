package HomeWork1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenTree {
    private Map<Person, List<Link>> tree;

    public GenTree() {
        tree = new HashMap<>();
    }
    public void addLinkPerson(Person p1, Person p2, Relation r1, Relation r2) {
        addLink(p1, p2, r1);
        addLink(p2, p1, r2);
    }
    private void addLink(Person p1, Person p2, Relation relation) {
        if (tree.containsKey(p1)) {
            tree.get(p1).add(new Link(p1, p2, relation));
        } else {
            List<Link> links = new ArrayList<>();
            links.add(new Link(p1, p2, relation));
            tree.put(p1, links);
        }
    }

    public Map<Person, List<Link>> getTree() {
        return tree;
    }
}
