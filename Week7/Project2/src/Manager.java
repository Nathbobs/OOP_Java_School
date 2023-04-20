public class Manager extends Employee {

    private int officeNum;
    private String team;

    public Manager(String name, int employeeNum, int officeNum, String team) {
        super(name, employeeNum);
    }

    public int getOfficeNum() {
        return officeNum;
    }
    public  String getTeam() {
        return team;
    }

    public void setOfficeNum(int officeNum) {
        this.officeNum = officeNum;
    }
    public void setTeam(String team) {
        this.team = team;
    }

    public String toString() {
        return ("Name : " + getName() + "\nLocation : " + getDepartment() + ", " + officeNum);
    }

    public boolean equals(Object obj) {
        if (obj == null) return false;
        else if (getClass() != obj.getClass()) return false;
        else {
            Employee otherEmp = (Employee) obj;
            return (getName().equals(otherEmp.getName()) && (getEmployeeNum() == otherEmp.getEmployeeNum()) && (officeNum == (otherEmp.officeNum) && team.equals(otherEmp.team) ));


        }
    }
}
