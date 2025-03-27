import java.util.ArrayList;
import java.util.List;

public class Student {

    public String fname;
    public String lname;
    public int indexNumber;
    public String email;
    public String address;
    public List<Double> grades = new ArrayList<>();


    public Student(String fname, String lname, int indexNumber, String email, String address) {
        this.fname = fname;
        this.lname = lname;
        this.indexNumber = indexNumber;
        this.email = email;
        this.address = address;
    }


    public void addGrade(double grade) {
        if (grades.size() >= 20) {
            throw new IllegalStateException("Student ma już maksymalną liczbę ocen ");
        }
        grades.add(grade);
    }


    public double computeAverage() {
        if (grades.isEmpty()) {
            throw new IllegalArgumentException("Brak ocen do obliczenia sredniej ");
        }
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        double avg = sum / grades.size();


        double rounded = 2 + Math.round((avg - 2) * 2) / 2.0;
        if (rounded < 2) {
            rounded = 2;
        } else if (rounded > 5) {
            rounded = 5;
        }
        return rounded;
    }
}