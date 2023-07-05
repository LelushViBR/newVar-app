package by.itstep.oop.inh;

public class Employee extends Person{
    private long salary;

    public Employee() {
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public Employee(int id , String name , String lastName){

        super(id,name);
        this.setLastName(lastName);
    }
    public Employee(int id , String name , String lastName,char gender , long salary){

        super(id,name,lastName,gender);
        this.setSalary(salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", gender=" + getGender() +
                ", salary=" + salary +
                '}';
    }
}
