//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] vasyaGrades = {3, 4, 5};
        Student vasya = new Student("Вася", vasyaGrades);

        Student petya = new Student("Петя", vasya.grades.clone());
        petya.grades[0] = 5;

        System.out.println(vasya);
        System.out.println(petya);

        Student andrey = new Student("Андрей", vasyaGrades.clone());
        vasya.grades[1] = 2;

        System.out.println(vasya);
        System.out.println(andrey);
    }
}