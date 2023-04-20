public class Engineer extends Employee {
    private String workZone;
    private String project;

    public Engineer(String name, int employeeNum, String workZone, String project) {
        super(name, employeeNum);
        this.workZone = workZone;
        this.project = project;
        /* Write the code */
    }

    public boolean equals(Object obj) {
        if (obj == null) return false;
        else if (getClass() != obj.getClass()) return false;
        else {
            Employee otherEmp = (Employee) obj;
            return (getName().equals(otherEmp.getName()) && (getEmployeeNum() == otherEmp.getEmployeeNum()) && (workZone.equals(otherEmp.workZone) && project.equals(otherEmp.project)));
            /* Write the code */

        }
        /* Write the code */
    }

    public String toString() {
        return ("Name : " + getName() + "\nLocation : " + getDepartment() + ", " + workZone);
        /* Write the code */
    }
}
