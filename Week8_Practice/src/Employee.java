import java.util.Date;

public class Employee {
    private String name;
    private Date hireDate;

    public Employee(){
        name = "No name";
        hireDate = new Date("January", 1, 1000); // Just a placeholder.
    }
}
