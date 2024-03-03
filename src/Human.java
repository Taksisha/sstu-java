public class Human {
    String lastName;
    String name;
    String surname;

    public Human(String name){
        this.name = name;
    }

    public Human(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }

    public Human(String name, String surname, String lastName){
        this.name = name;
        this.surname = surname;
        this.lastName = lastName;
    }

    @Override
    public String toString(){
        //удаление null элементов
        String result = "";
        if(lastName != null){
            result += lastName + " ";
        }
        if(name != null){
            result += name + " ";
        }
        if(surname != null){
            result += surname;
        }
        return result.trim();
        //return lastName + " " + name + " " + surname;
    }
}
