//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] vasyaGrades = {3, 4, 5, 4};
        Student vasya = new Student("Вася", vasyaGrades);
        Student petya = new Student("Петя", 5, 5, 5, 5);

        System.out.println("Вася: средний балл - " + vasya.getAverageGrade() + ", отличник - " + vasya.isExcellentStudent());
        System.out.println("Петя: средний балл - " + petya.getAverageGrade() + ", отличник - " + petya.isExcellentStudent());
    }
}