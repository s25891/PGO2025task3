import java.util.ArrayList;
import java.util.List;

public class StudentGroup {

    public String nazwa;

    public List<Student> students = new ArrayList<>();


    public StudentGroup(String nazwa) {
        this.nazwa = nazwa;
    }


    public void addStudent(Student student) {
        if (students.size() >= 15) {
            throw new IllegalStateException("Grupa ma już maksymalną liczbę studentów ");
        }
        if (students.contains(student)) {
            throw new IllegalStateException("Student jest już przypisany do tej grupy ");
        }
        students.add(student);
    }
}