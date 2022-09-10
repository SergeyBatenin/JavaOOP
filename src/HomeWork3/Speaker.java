package HomeWork3;

import java.util.List;

public class Speaker  implements ISpeaker {

    public void callStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student.getName() + " бегом в процедурку");
        }
        System.out.println();
    }
}
