//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] vasyaGrades = {3, 4, 5};
        Student vasya = new Student("Вася", vasyaGrades);
        Student maxim = new Student("Максим");

        System.out.println(vasya);
        System.out.println(maxim);
    }
}