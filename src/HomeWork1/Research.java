package HomeWork1;

import java.util.List;

public class Research {
    public static void makeResearch(Person person, Relation relation, GenTree tree) {
        List<Link> links = tree.getTree().get(person);
        for (Link link : links) {
            if (link.getRelation() == relation) {
                System.out.println(relation + " " + link.getPersonSecond().getFullName());
            }
        }
    }
}
