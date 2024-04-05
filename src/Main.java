public class Main {
    public static void main(String[] args) {
        Department department = new Department("Отдел разработки");
        Employee chief = new Employee("Иванов", department);
        department.setChief(chief);

        Employee employee1 = new Employee("Петров", department);
        Employee employee2 = new Employee("Сидоров", department);

        department.addEmployee(chief);
        department.addEmployee(employee1);
        department.addEmployee(employee2);

        for (Employee employee : department.getEmployees()){
            System.out.println(employee);
        }
    }
}
