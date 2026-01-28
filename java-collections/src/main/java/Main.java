import assignment.EmpKey;

import java.util.*;

public class Main {

    public static void main(String[] args) {

//        :: code for ques 1 ::
//     new Ques1().startAns();

//        :: code for ques 2 ::

/*
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Rahul Sharma",25.0, 50000.0 ));
        employees.add(new Employee("Amit Verma",30.0, 70000.0 ));
        employees.add(new Employee("Rahul Mehta",28.0, 60000.0 ));
        employees.add(new Employee("Neha Singh",35.0, 90000.0 ));

        Collections.sort(employees);

        System.out.println("Sorted by Name: ");
        for(Employee e:employees){
            System.out.println(e);
        }

        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getSalary().compareTo(o2.getSalary());
            }
        });

        System.out.println("\nSorted by Salary (Comparator):");
        for (Employee e : employees) {
            System.out.println(e);
        }
*/

//        :: code for ques 3 :
        /*
        SpecialStack stack = new SpecialStack(10);

        stack.push(5);
        stack.push(2);
        stack.push(8);
        stack.push(1);
        stack.push(3);

        System.out.println("Minimum: " + stack.getMin()); // 1

        stack.pop();
        stack.pop();

        System.out.println("Minimum after pops: " + stack.getMin());
*/

//        :: code for ques 4 ::
        Map<EmpKey, Double> salaryMap = new HashMap<>();

        EmpKey e1 = new EmpKey("Rahul", 25, "Developer");
        EmpKey e2 = new EmpKey("Amit", 30, "Manager");
        EmpKey e3 = new EmpKey("Neha", 28, "Tester");

        salaryMap.put(e1, 50000.0);
        salaryMap.put(e2, 80000.0);
        salaryMap.put(e3, 60000.0);

        // Access salary using key
        System.out.println("Salary of Rahul: " + salaryMap.get(e1));

        // Test equality with new object having same data
        EmpKey e4 = new EmpKey("Rahul", 25, "Developer");
        System.out.println("Salary using new object key: " + salaryMap.get(e4));


        System.out.println("\nAll Employees:");
        for (Map.Entry<EmpKey, Double> entry : salaryMap.entrySet()) {
            System.out.println(entry.getKey() + " → Salary: " + entry.getValue());
        }

    }
}
