public class Main {
    public static void main(String[] args) {
        Human kleopatra = new Human("Клеопатра");
        Human pushkin = new Human("Александр", "Сергеевич", "Пушкин");
        Human maiakovski = new Human("Владимир", "Маяковский");
        Human hristofor = new Human("Христофор", "Бонифатьевич");

        System.out.println(kleopatra.toString());
        System.out.println(pushkin.toString());
        System.out.println(maiakovski.toString());
        System.out.println(hristofor.toString());
    }

}
