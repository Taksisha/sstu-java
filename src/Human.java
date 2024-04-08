public class Human {
    private final String lastName;
    private final String name;
    private final String surname;

    public Human(String name) {
        this.name = name;
        this.lastName = null;
        this.surname = null;
    }

    public Human(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        this.surname = null;
    }

    public Human(String name, String surname, String lastName) {
        this.name = name;
        this.surname = surname;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        if (lastName != null) {
            result.append(lastName).append(" ");
        }
        result.append(name);
        if (surname != null) {
            result.append(" ").append(surname);
        }
        return result.toString().trim();
    }
}