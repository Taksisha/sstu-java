//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.put(3);

        try {
            System.out.println(intBox.get());
        } catch (IllegalStateException e) {
            System.out.println("Box is empty");
        }
    }
}