package HomeWork3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Nurse {
    // Условные медицинские знания медсестры
    // Есть вопрос по ним, просьба напомнить
    private static Map<Disease, String> medicalKnowledge = Map.of(
            Disease.FLU, "Аспирин",
            Disease.OSPA, "Зеленка",
            //Disease.PLAGUE, "Аскорбинка",
            Disease.COVID, "Мирамистин",
            Disease.EBOLA, "Слабительное"
    );
    private Map<String, Integer> pillows;
    Speaker speaker;
    Journal journal;

    public Nurse(Map<String, Integer> pillows, Speaker speaker, Journal journal) {
        this.pillows = pillows;
        this.speaker = speaker;
        this.journal = journal;
    }

    public Map<String, Integer> getPillows() {
        return pillows;
    }

    // Вызываем больных студентов на процедуры
    public void callStudentsForProcedures() {
        List<Student> sickList = selectionSickStudents(journal);
        speaker.callStudents(sickList);
        medicalCare(sickList);
    }
    // Сортируем студентов по силе заражения
    private List<Student> selectionSickStudents(Journal journal) {
        List<Student> sickList = createSickList(journal);
        sickList.sort(new CompareByInfection());
        //Collections.sort(sickList);
        return sickList;
    }
    // Генерируем список студентов, которые больны
    // Можно сделать публичным в принципе, видимо будет зависеть от ситуации
    private List<Student> createSickList(Journal journal) {
        List<Student> sickList = new ArrayList<>(journal.getJournal());
        Iterator<Student> it = sickList.iterator();
        while (it.hasNext()) {
            if (it.next().getGeneralInfectionIndex() == 0) {
                it.remove();
            }
        }
        return sickList;
    }
    // Оказание медицинских услуг больному населению))
    private void medicalCare(List<Student> students) {
        for (Student student : students) {
            if (isCured(student)) {
                System.out.println(student.getName() + " теперь здоров!");
            } else {
                System.out.println(student.getName() + " все еще болен " + student.getHealthStatuses());
            }
            System.out.println();
        }
    }

    private boolean isCured(Student student) {
        List<DiseaseDegree> studentDiseases = student.getHealthStatuses();
        Iterator<DiseaseDegree> it = studentDiseases.iterator();
        while (it.hasNext()) {
            Disease disease = it.next().getDisease();
            if (medicalKnowledge.containsKey(disease)) {
                String necessaryMedication = medicalKnowledge.get(disease);
                if (isHaveRemedy(necessaryMedication)) {
                    pillows.put(necessaryMedication, pillows.get(necessaryMedication) - 1);
                    System.out.println("Медсестра дает " + student.getName() + " " + necessaryMedication);
                    System.out.println(student.getName() + " вылечился от " + disease);
                    it.remove();
                } else {
                    System.out.println("У медсестры нет в наличие " + necessaryMedication);
                }
            } else {
                System.out.println("Медсестра не знает чем лечить " + disease);
            }
        }
        return studentDiseases.size() == 0;
    }

    private boolean isHaveRemedy(String remedy) {
        return this.pillows.containsKey(remedy);
    }
}
