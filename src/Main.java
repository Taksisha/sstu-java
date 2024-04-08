//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Создаем объекты студентов с корректными оценками
        int[] vasyaGrades = {3, 4, 5, 4};
        Student vasya = new Student("Вася", vasyaGrades);
        Student petya = new Student("Петя", 5, 5, 5, 5);

        // Пытаемся создать студента с некорректной оценкой (1)
        int[] incorrectGrades = {2, 3, 1, 5};
        Student incorrectStudent = new Student("Некорректный", incorrectGrades);

        // Выводим информацию о студентах
        System.out.println(vasya);
        System.out.println("Вася: средний балл - " + vasya.getAverageGrade() + ", отличник - " + vasya.isExcellentStudent());
        System.out.println(petya);
        System.out.println("Петя: средний балл - " + petya.getAverageGrade() + ", отличник - " + petya.isExcellentStudent());
        System.out.println(incorrectStudent);
        System.out.println("Некорректный: средний балл - " + incorrectStudent.getAverageGrade() + ", отличник - " + incorrectStudent.isExcellentStudent());
    }
}