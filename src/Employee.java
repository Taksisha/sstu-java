public class Employee {
    String name;
    Department department;

    public Employee(String name, Department department){
        this.name = name;
        this.department = department;
    }

    public String toString(){
        if(department.chief == this){
            return name + " начальник отдела " + department.name;
        }
        else{
            return name + " работает в отделе " + department;
        }
    }
}
