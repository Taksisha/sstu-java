import java.util.ArrayList;

public class Department {
    String name;
    Employee chief;
    ArrayList<Employee> employees;

    public Department(String name){
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public String toString(){
        return name + " начальник которого " + chief.name;
    }
}
