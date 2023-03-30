public class EmployeeManager {
    public static void main(String[] args) {

        System.out.println("Student Name: Abegunde Adebowale Nathaniel " + " Student id: 2022055741");
        System.out.println("..............................................");

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();

        employee1 = new Employee("Walter White", 42, "Manager", 20000);
        employee2 = new Employee("Jesse Pinkman", 32, "Assistant Manager", 12000, 7);
        employee3 = new Employee("Jimmie McGill", 38);
        employee4 = new Employee("Chuck McGill", 40);
        employee5 = new Employee("Walter White", 42, "Manager", 20000);

        employee1.setSalary(21000);
        employee1.outInfo();
        employee2.outInfo();
        System.out.println(employee3.vacation(10));
        System.out.println(employee2.vacation(10));
        System.out.println(" ");
        employee3.outInfo();
        System.out.println(employee1.equals(employee2));
        System.out.println(employee1.equals(employee5));


    }

}
