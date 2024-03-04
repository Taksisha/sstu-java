//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cat barsik= new Cat("Барсик");
        System.out.println(barsik.toString());

        barsik.meow(1);
        barsik.meow(3);
    }
}