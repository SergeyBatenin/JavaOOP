package HomeWork3;

import java.util.Comparator;

public class CompareByInfection implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getGeneralInfectionIndex() < o2.getGeneralInfectionIndex())
            return 1;
        else if (o1.getGeneralInfectionIndex() > o2.getGeneralInfectionIndex())
            return -1;
        else
            return 0;
    }
}
