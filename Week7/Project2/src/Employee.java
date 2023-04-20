public class Employee {
    protected int officeNum;
    protected String team;
    protected String workZone;
    protected String project;
    private String name;
    private int employeeNum;
    private String department = "No Dept";

    public Employee(String name, int employeeNum) {
        this.name = name;
        this.employeeNum = employeeNum;
    }

    public Employee(String name, int employeeNum, String department) {
        this.name = name;
        this.employeeNum = employeeNum;
        this.department = department;
    }

    public String getDepartment() {

        return department;
    }

    public String getName() {

        return name;
    }

    public int getEmployeeNum() {
        return employeeNum;
        /* Write the code */
    }

    public void setDepartment(String department) {

        this.department = department;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setEmployeeNum(int employeeNum) {
        this.employeeNum = employeeNum;
    }

    public boolean equals(Object obj) {
        if(obj ==null) return false;
        else if(getClass() !=obj.getClass()) return false;
        else{
            Employee otherEmp = (Employee)obj;
            return (name.equals(otherEmp.name) && (employeeNum == otherEmp.employeeNum) );
        }


        /* Write the code */
    }

    public String toString() {
        return ("Name : " + this.name + "\nEmp# : " + this.employeeNum);
    }
}
