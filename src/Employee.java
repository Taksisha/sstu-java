public class Employee {
    String name;
    Department department;

    public Employee(String name, Department department){
        this.name = name;
        this.department = department;
    }

    public String toString(){
        if(department.getChief() == this){
            return name + " начальник отдела " + department.getName();
        }
        else{
            return name + " работает в отделе " + department.getName();
        }
    }

    public Object getName() {
        return name;
    }
}
