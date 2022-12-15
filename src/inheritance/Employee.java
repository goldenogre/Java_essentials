package inheritance;

public class Employee extends Person{
    public Employee(){
        super("Default"); // this is default of super class Person. make it first to compile
        System.out.println("Employee constructor.");
    }
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String employeeId;
    private String title;


}
