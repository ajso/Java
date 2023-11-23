package EmployeeApp;

public class EmployeeModel {

    private int id;
    private String name;
    private int age;
    private String department;
    private String designation;
    private double salary;

    public EmployeeModel(int id, String name, int age, String department, String designation, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "EmployeeModel[id=" + id + ", " +
                "name=" + name + ", " +
                "age=" + age + ", " +
                "department=" + department + ", " +
                "designation=" + designation + ", salary=" + salary + "]";
    }
}
