package ru.obydennova.student;
import java.util.ArrayList;

public class Student implements Comparable<Student> {
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

    @Override
    public int compareTo(Student otherStudent) {
        double thisAverage = this.getAverageGrade();
        double otherAverage = otherStudent.getAverageGrade();
        if (thisAverage > otherAverage) {
            return 1;
        } else if (thisAverage < otherAverage) {
            return -1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Кристина", 4, 5, 5);
        Student student2 = new Student("Рома", 3, 4, 4);

        int comparison = student1.compareTo(student2);

        if (comparison > 0) {
            System.out.println(student1.name + " имеет более высокий средний балл.");
        } else if (comparison < 0) {
            System.out.println(student2.name + " имеет более высокий средний балл.");
        } else {
            System.out.println("Оба ученика имеют одинаковую среднюю оценку.");
        }
    }
}

