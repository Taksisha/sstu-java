import java.util.ArrayList;

public class Department {
    String name;
    Employee chief;
    ArrayList<Employee> employees;

    public Department(String name){
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void setChief(Employee chief){
        this.chief = chief;
    }

    public Employee getChief(){
        return chief;
    }

    public void addEmployee(Employee employee){
        this.employees.add(employee);
    }

    public ArrayList<Employee> getEmployees(){
        return employees;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return name + " начальник которого " + (Employee)chief.getName();
    }
}
