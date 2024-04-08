import java.util.ArrayList;

class Student {
    String name;
    int[] grades;

    public Student(String name, int... grades) {
        this.name = name;
        if (grades != null) {
            ArrayList<Integer> validGrades = new ArrayList<>();
            for (int grade : grades) {
                if (grade >= 2 && grade <= 5) {
                    validGrades.add(grade);
                }
            }
            this.grades = validGrades.stream().mapToInt(Integer::intValue).toArray();
        } else {
            this.grades = new int[0];
        }
    }

    public double getAverageGrade() {
        if (grades.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    public boolean isExcellentStudent() {
        if (grades.length == 0) {
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
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(": [");
        for (int i = 0; i < grades.length; i++) {
            sb.append(grades[i]);
            if (i != grades.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}