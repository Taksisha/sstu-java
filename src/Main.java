public class Main {
    public static void main(String[] args) {
        Human kleopatra = new Human("Клеопатра", 152);
        Human pushkin = new Human("Пушкин", 167);
        Human vladimir = new Human("Владимир", 189);

        System.out.println(kleopatra.toString());
        System.out.println(pushkin.toString());
        System.out.println(vladimir.toString());
    }
}