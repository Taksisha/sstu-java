//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Name cleopatra = new Name("Клеопатра");
        Name pushkin = new Name("Александр", "Сергеевич", "Пушкин");
        Name mayakovsky = new Name("Владимир", "Маяковский");

        Human human1 = new Human(cleopatra.toString(), 152);
        Human human2 = new Human(pushkin.toString(), 167);
        Human human3 = new Human(mayakovsky.toString(), 189);

        System.out.println(human1.toString());
        System.out.println(human2.toString());
        System.out.println(human3.toString());
    }
}