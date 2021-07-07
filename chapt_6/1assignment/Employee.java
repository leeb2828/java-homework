public class Employee {
    String name;
    int idNumber;
    String department;
    String position;
    
    // first constructor
    public Employee(String name, int idNumber, String department, String position) {
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
    }
    // second constructor
    public Employee(String name, int idNumber) {
        this.name = name;
        this.idNumber = idNumber;
        position = department = "";
    }
    // third constructor
    public Employee() {
        // these variables are all assigned as empty strings
        name = department = position = "";
        idNumber = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public int getIdNumber() {
        return this.idNumber;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return this.position;
    }
}