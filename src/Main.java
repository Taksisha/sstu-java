//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Gun gun = new Gun(3);

        for (int i = 0; i < 5; i++) {
            gun.shot();
        }
    }
}