package assignment;

public class Employee implements Comparable<EmpKey> {

    private String name;
    private Double age;
    private Double salary;

    public Employee(String name, Double age, Double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public int compareTo(EmpKey other) {
        String[] currEmpName = this.name.split(" ");
        String[] otherEmpName = other.getName().split(" ");

        String currEmpFirstName = currEmpName[0];
        String currEmpLastName = currEmpName.length > 1 ? currEmpName[1]: "";

        String otherEmpFirstName = otherEmpName[0];
        String otherEmpLastName = otherEmpName.length > 1 ? otherEmpName[1]: "";

        int firstNameCompare = currEmpFirstName.compareToIgnoreCase(otherEmpFirstName);

        if(firstNameCompare!=0){
            return firstNameCompare;
        }

        return currEmpLastName.compareToIgnoreCase(otherEmpLastName);
    }

    @Override
    public String toString() {
        return name + " | Age: " + age + " | Salary: " + salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
