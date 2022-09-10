package HomeWork3;

import java.util.ArrayList;
import java.util.List;

public class Journal {
    private List<Student> journal;

    public Journal() {
        journal = new ArrayList<>();
    }

    public void addStudent(Student student) {
        journal.add(student);
    }

    public List<Student> getJournal() {
        return journal;
    }
}
