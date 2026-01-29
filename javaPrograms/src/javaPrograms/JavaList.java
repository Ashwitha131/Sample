package javaPrograms;
import java.util.*;

//public class JavaList {
//
//	        // Create a List of Employee objects
//public static void main(String[] args) {
//	        List<Employee> employees = new ArrayList<>();
//	        employees.add(new Employee(101, "Alice", 75000.0));
//	        employees.add(new Employee(102, "Bob", 50000.0));
//	        employees.add(new Employee(103, "Charlie", 90000.0));
//
//	        // Sort employees by salary using Collections.sort() and a Comparator
//	        // Comparator.comparingDouble is preferred for performance over generic comparing()
//	        Collections.sort(employees, Comparator.comparingDouble(Employee::salary));
//
//	        // Print the sorted employees
//	        System.out.println("Employees sorted by salary (Ascending):");
//	        employees.forEach(System.out::println);
//	    }
//	}



class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + id +
                ", Name='" + name + '\'' +
                ", Salary=" + salary +
                '}';
    }
}

public class JavaList {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Alice", 55000));
        employees.add(new Employee(102, "Bob", 45000));
        employees.add(new Employee(103, "Charlie", 70000));

        // Sort by salary using Comparator
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Double.compare(e1.getSalary(), e2.getSalary());
            }
        });

        // Print sorted list
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}

