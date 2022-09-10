package HomeWork3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Speaker speaker = new Speaker();
        Journal journal = new Journal();
        Map<String, Integer> pillows = new HashMap<>();

        Student student1 = new Student("Иванов", 8, new DiseaseDegree());
        Student student2 = new Student("Петров", 10, new DiseaseDegree(Disease.EBOLA));
        Student student3 = new Student("Сидоров", 12, new DiseaseDegree(Disease.PLAGUE));
        Student student4 = new Student("Чапаев", 20, new DiseaseDegree(Disease.OSPA));
        Student student5 = new Student("Баранов", 15);

        journal.addStudent(student1);
        journal.addStudent(student2);
        journal.addStudent(student3);
        journal.addStudent(student4);
        journal.addStudent(student5);

        student4.addDisease(new DiseaseDegree(Disease.COVID));

        pillows.put("Уголь", 100);
        pillows.put("Аспирин", 100);
        pillows.put("Зеленка", 100);
        pillows.put("Аскорбинка", 100);
        pillows.put("Слабительное", 100);

        Nurse nurse = new Nurse(pillows, speaker, journal);
        nurse.callStudentsForProcedures();

    }
}
