public class Employee {
        private String name = "";
        private String position = "Engineer";
        private int age = 0;
        private int salary = 15000;
        private int vacationDays = 20;

    public Employee() {
        name = " ";
        position = "Engineer" ;
        salary = 15000;
        vacationDays = 20;
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Employee(String name, int age, String position,int salary) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String name, int age, String position , int salary, int vacationDays) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;
        this.vacationDays = vacationDays;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void outInfo() {
        System.out.println("name : " + name);
        System.out.println("age : " + age);
        System.out.println("position : " + position);
        System.out.println("salary : " + salary);
        System.out.println("vacationDays : " + vacationDays);
        System.out.println(" ");
    }

    public String vacation(int vDays) {
        if (vDays <= vacationDays){
            vacationDays = vacationDays - vDays;
            return "Possible";

        } else
            return "impossible";
    }

    public boolean equals(Employee anotherEmployee) {

        if (this.name.equals(anotherEmployee.name) && this.age == anotherEmployee.age)

            return true;
        else
            return false;
    }

}
