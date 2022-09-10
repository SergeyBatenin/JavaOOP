package HomeWork3;

import java.util.ArrayList;
import java.util.List;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private int generalInfectionIndex;
    private List<DiseaseDegree> healthStatuses = new ArrayList<>();

    public Student(String name, int age, DiseaseDegree healthStatus) {
        this.name = name;
        this.age = age;
        healthStatuses.add(healthStatus);
        generalInfectionIndex = healthStatus.getDegree();
    }
    public Student(String name, int age) {
        this(name, age, new DiseaseDegree());
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGeneralInfectionIndex() {
        return generalInfectionIndex;
    }

    public void setGeneralInfectionIndex(int generalInfectionIndex) {
        this.generalInfectionIndex = generalInfectionIndex;
    }

    public List<DiseaseDegree> getHealthStatuses() {
        return healthStatuses;
    }

    public void setHealthStatuses(List<DiseaseDegree> healthStatuses) {
        this.healthStatuses = healthStatuses;
    }

    public void addDisease(DiseaseDegree diseaseDegree) {
        healthStatuses.add(diseaseDegree);
        generalInfectionIndex += diseaseDegree.getDegree();
    }

    public boolean isIllness() {
        return getGeneralInfectionIndex() > 0;
    }

    @Override
    public int compareTo(Student o) {
        //return Integer.compare(this.generalInfectionIndex, o.generalInfectionIndex);
        if (this.generalInfectionIndex < o.generalInfectionIndex)
            return 1;
        else if (this.generalInfectionIndex > o.generalInfectionIndex)
            return -1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "\nСтудент " + name +
                "\nВозраст = " + age +
                "\nИндекс заразности =" + generalInfectionIndex;
    }
}
