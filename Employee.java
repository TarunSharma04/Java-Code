// Define the Employee class to store employee details
class Employee {
    private int id;         // Attribute to store employee ID
    private String name;    // Attribute to store employee name
    private double salary;  // Attribute to store employee salary

    // Constructor to initialize employee details
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getter method for employee ID
    public int getId() {
        return id;
    }

    // Setter method for employee ID
    public void setId(int id) {
        this.id = id;
    }

    // Getter method for employee name
    public String getName() {
        return name;
    }

    // Setter method for employee name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for employee salary
    public double getSalary() {
        return salary;
    }

    // Setter method for employee salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Override toString method to provide a readable representation of the Employee object
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

// // Main class to demonstrate the Employee class
// public class Solution {
//     public static void main(String[] args) {
//         // Creating Employee objects
//         Employee employee1 = new Employee(1, "John", 50000);
//         Employee employee2 = new Employee(2, "Jane", 60000);
//         Employee employee3 = new Employee(3, "Mike", 55000);

//         // Re-initializing attributes of employee objects
//         employee1.setId(4);
//         employee1.setName("Robert");
//         employee1.setSalary(52000);

//         employee2.setId(5);
//         employee2.setName("Emily");
//         employee2.setSalary(58000);

//         employee3.setId(6);
//         employee3.setName("David");
//         employee3.setSalary(56000);

//         // Printing employee details
//         System.out.println(employee1);
//         System.out.println(employee2);
//         System.out.println(employee3);
//     }
// }
