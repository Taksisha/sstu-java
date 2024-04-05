import java.util.ArrayList;
import java.util.List;

class Student {
    String name;
    List grades;

    public Student(String name, int... grades) {
        this.name = name;
        this.grades = new ArrayList<>();
        for (int grade : grades) {
            if (grade >= 2 && grade <= 5) {
                this.grades.add(grade);
            }
        }
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public double getAverageGrade() {
        if (grades.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    public boolean isExcellentStudent() {
        if (grades.isEmpty()) {
            return false;
        }
        for (int grade : grades) {
            if (grade != 5) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return name + ": " + grades.toString();
    }
}