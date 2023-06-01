
public class Contact <T> implements Comparable /* my code */{
    private String name;
    private String telNum;
    private String email;

    public Contact(String name, String telNum, String email) {
        this.name = name;
        this.telNum = telNum;
        this.email = email;


        /* my code */
    }

    public Contact(String name) {
        this.name = name;

        /* my code */
    }

    public String getTelNum() {
        return telNum;
        /* my code */ }
    public void setTelNum(String telNum) {
        this.telNum = telNum;
        /* my code */ }
    public String getEmail() {
        return email;
        /* my code */ }
    public void setEmail(String email) {
        this.email = email;
        /* my code */ }
    public String getName() {
        return name;
        /* my code */ }

    public String toString() {
        return "Name: " + name + "\ttelNum: " + telNum + "\temail: " + email + "\n";
    }

    public boolean equals(Object obj) {
        if(obj == null)
            return false;
        else if (getClass() != obj.getClass())
            return false;
        else {
            Contact otherManager = (Contact) obj;
            return this.getName().equals(otherManager.getName());
        }
        /* your code */
    }

    public int compareTo(Object obj) {
        if(obj==null) throw new NullPointerException("Object is null");
        else if(this.getClass()!=obj.getClass()) throw new ClassCastException("Object not of the same type");
        else {
            Contact otherManager = (Contact) obj;
            int compare = this.getName().compareTo(otherManager.getName());
            return compare;
        }
    }
}
