public class Main {
    public static void main(String[] args) {
        Department department = new Department("Отдел разработки");
        Employee chief = new Employee("Иванов", department);
        department.chief = chief;

        Employee employee1 = new Employee("Петров", department);
        Employee employee2 = new Employee("Сидоров", department);

        department.employees.add(chief);
        department.employees.add(employee1);
        department.employees.add(employee2);

        for (Employee employee : employee1.department.employees){
            System.out.println(employee);
        }

        /* System.out.println(chief.toSting());
        System.out.println(employee1.toSting());
        System.out.println(employee2.toSting()); */
    }
}
